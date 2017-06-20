package view.game;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.*;
import view.about.AboutPresenter;
import view.about.AboutView;
import view.endgame.EndgamePresenter;
import view.endgame.EndgameView;
import view.start.StartPresenter;
import view.start.StartView;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 16:04
 */
public class GamePresenter {
    private GameView view;
    private Tank tankOne;
    private Tank tankTwo;
    private Terrain terrain;


    private boolean turnOne = true; // True = player one turn .... False = player two turn

    public GamePresenter(GameView view, Terrain terrain, Tank tankOne, Tank tankTwo ) {
        this.view = view;
        this.terrain = terrain;
        this.tankOne = tankOne;
        this.tankTwo = tankTwo;
        updateView();
        addEventHandlers();
    }

    private void addEventHandlers() {
        Rectangle cannonOne = new Rectangle(tankOne.getxPos()-2, tankOne.getyPos()-20,4,20);
        Rectangle cannonTwo = new Rectangle(tankTwo.getxPos()-2, tankTwo.getyPos()-20,4,20);
        cannonOne.setFill(new ImagePattern(new Image("images/trump.png")));
        cannonTwo.setFill(Color.BEIGE);
        view.getGameGroup().getChildren().addAll(cannonOne, cannonTwo);
        tankOne.setAngle(90);
        tankTwo.setAngle(90);
        view.getAngleTFOne().setText(Integer.toString(tankOne.getAngle()));
        view.getAngleTFTwo().setText(Integer.toString(tankTwo.getAngle()));
        view.getPowerTFOne().setText(Integer.toString(tankOne.getPower()));
        view.getPowerTFTwo().setText(Integer.toString(tankTwo.getPower()));


        view.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.RIGHT)) {
                    if (turnOne == true) {
                        RotateTransition transition1 = new RotateTransition();
                        transition1.setNode(cannonOne);
                        transition1.setDuration(Duration.millis(1));
                        transition1.setToAngle(-((tankOne.getAngle() - 90)) + 1);
                        transition1.setCycleCount(1);
                        transition1.setInterpolator(Interpolator.LINEAR);
                        transition1.play();
                        tankOne.decreaseAngle();
                        view.getAngleTFOne().setText(Integer.toString(tankOne.getAngle()));
                    } else {
                        RotateTransition transition1 = new RotateTransition();
                        transition1.setNode(cannonTwo);
                        transition1.setDuration(Duration.millis(1));
                        transition1.setToAngle((tankTwo.getAngle() + 90) - 1);
                        transition1.setCycleCount(1);
                        transition1.setInterpolator(Interpolator.LINEAR);
                        transition1.play();
                        tankTwo.increaseAngle();
                        view.getAngleTFTwo().setText(Integer.toString(tankTwo.getAngle()));
                    }
                }
                if (event.getCode().equals(KeyCode.LEFT)) {
                    if (turnOne == true) {
                        RotateTransition transition1 = new RotateTransition();
                        transition1.setNode(cannonOne);
                        transition1.setDuration(Duration.millis(10));
                        transition1.setToAngle((-(tankOne.getAngle() - 90) + 1));
                        transition1.setCycleCount(1);
                        transition1.setInterpolator(Interpolator.LINEAR);
                        transition1.play();
                        tankOne.increaseAngle();
                        view.getAngleTFOne().setText(Integer.toString(tankOne.getAngle()));
                    } else {
                        RotateTransition transition1 = new RotateTransition();
                        transition1.setNode(cannonTwo);
                        transition1.setDuration(Duration.millis(1));
                        transition1.setToAngle((tankTwo.getAngle() + 90) - 1);
                        transition1.setCycleCount(1);
                        transition1.setInterpolator(Interpolator.LINEAR);
                        transition1.play();
                        tankTwo.decreaseAngle();
                        view.getAngleTFTwo().setText(Integer.toString(tankTwo.getAngle()));
                    }
                }
                if (event.getCode().equals(KeyCode.UP)) {
                    if (turnOne == true) {
                        tankOne.increasePower();
                        view.getPowerTFOne().setText(Integer.toString(tankOne.getPower()));
                    } else {
                        tankTwo.increasePower();
                        view.getPowerTFTwo().setText(Integer.toString(tankTwo.getPower()));
                    }
                }
                if (event.getCode().equals(KeyCode.DOWN)) {
                    if (turnOne == true) {
                        tankOne.decreasePower();
                        view.getPowerTFOne().setText(Integer.toString(tankOne.getPower()));
                    } else {
                        tankTwo.decreasePower();
                        view.getPowerTFTwo().setText(Integer.toString(tankTwo.getPower()));
                    }
                }
                if (event.getCode().equals(KeyCode.SHIFT)) {
                    if (turnOne == true) {
                        turnOne = false;
                        MoveTo moveTo = new MoveTo();
                        moveTo.setX(tankOne.getxPos());
                        moveTo.setY(tankOne.getyPos());

                        QuadCurveTo quadCurveTo = new QuadCurveTo();
                        quadCurveTo.setControlX((Math.cos(Math.toRadians(tankOne.getAngle())) * tankOne.getPower() * 100) + tankOne.getxPos());
                        quadCurveTo.setControlY((Math.sin(Math.toRadians(tankOne.getAngle())) * tankOne.getPower()) - tankOne.getyPos());
                        if (quadCurveTo.getControlX() * 2 > 780) {
                            quadCurveTo.setX(780);
                            quadCurveTo.setY(100);
                        } else {
                            quadCurveTo.setX((quadCurveTo.getControlX()) * 2 - tankOne.getxPos());
                            quadCurveTo.setY(460);
                        }
                        if (quadCurveTo.getControlY() < 0) {
                            quadCurveTo.setControlY(0);
                        }
                        Path path = new Path();
                        path.setFill(null);
                        path.setStrokeWidth(0);
                        path.getElements().add(moveTo);
                        path.getElements().add(quadCurveTo);

                        Circle circle = new Circle(5);
                        view.getGameGroup().getChildren().addAll(circle, path);

                        PathTransition transition = new PathTransition(Duration.seconds(1), path, circle);
                        transition.setCycleCount(1);
                        transition.setAutoReverse(false);
                        transition.play();
                    } else {
                        turnOne = true;
                        MoveTo moveTo = new MoveTo();
                        moveTo.setX(tankTwo.getxPos());
                        moveTo.setY(tankTwo.getyPos());

                        QuadCurveTo quadCurveTo = new QuadCurveTo();
                        quadCurveTo.setControlX((Math.cos(Math.toRadians(90 + tankTwo.getAngle())) * tankTwo.getPower() * 100) + tankTwo.getxPos());
                        quadCurveTo.setControlY((Math.sin(Math.toRadians(90 + tankTwo.getAngle())) * tankTwo.getPower()) - tankTwo.getyPos());
                        quadCurveTo.setX(quadCurveTo.getControlX() - (tankTwo.getxPos() - quadCurveTo.getControlX()));
                        if (quadCurveTo.getX() < 0) {
                            quadCurveTo.setX(0);
                            quadCurveTo.setY(100);
                        } else {
                            quadCurveTo.setY(460);
                        }
                        if (quadCurveTo.getControlY() < 0) {
                            quadCurveTo.setControlY(0);
                        }
                        Path path = new Path();
                        path.setFill(null);
                        path.setStrokeWidth(0);
                        path.getElements().add(moveTo);
                        path.getElements().add(quadCurveTo);

                        Circle circle = new Circle(5);
                        view.getGameGroup().getChildren().addAll(circle, path);

                        PathTransition transition = new PathTransition(Duration.seconds(1), path, circle);
                        transition.setCycleCount(1);
                        transition.setAutoReverse(false);
                        transition.play();
                    }
                }
                if (event.getCode().equals(KeyCode.D)) {
                    EndgameView endgameView = new EndgameView();
                    new EndgamePresenter(endgameView);
                    Scene scene = view.getScene();
                    scene.setRoot(endgameView);
                }
            }
        });
        view.getBtnHelp().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AboutView aboutView = new AboutView();
                new AboutPresenter(aboutView);
                Stage aboutStage = new Stage();
                aboutStage.initOwner(view.getScene().getWindow());
                aboutStage.initModality(Modality.APPLICATION_MODAL);
                aboutStage.setScene(new Scene(aboutView));
                aboutStage.setX(view.getScene().getWindow().getX());
                aboutStage.setY(view.getScene().getWindow().getY() + 100);
                aboutStage.showAndWait();
            }
        });
    }

    private void updateView() {
    }
}
