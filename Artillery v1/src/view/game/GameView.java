package view.game;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 16:04
 */
public class GameView extends GridPane {
    private Button btnQuit;
    private Button btnHelp;
    private ImageView portraitOneIV;
    private ImageView portraitTwoIV;
    private Label powerOne;
    private Label angleOne;
    private Label powerTwo;
    private Label angleTwo;
    private TextField powerTFOne;
    private TextField angleTFOne;
    private TextField powerTFTwo;
    private TextField angleTFTwo;
    private double[] gcX;
    private double[] gcY;
    private GameGroup gameGroup;

    public GameView(GameGroup gameGroup){
        this.gameGroup = gameGroup;
        initialisatieNodes();
        layoutNodes();
        getStylesheets().add("css/stylesheet.css");
    }

    private void layoutNodes() {
        // Canvas

        //Padding en Allignment Scene
        setAlignment(Pos.CENTER);
        setPadding(new Insets(10));


        // Buttons en Labels
        btnQuit.setMinHeight(30);
        btnQuit.setMinWidth(100);
        btnHelp.setMinHeight(30);
        btnHelp.setMinWidth(100);
        portraitOneIV.setImage(new Image("/images/trump.png"));
        portraitTwoIV.setImage(new Image("/images/osama.png"));
        portraitTwoIV.setFitHeight(100);
        portraitOneIV.setFitHeight(100);
        portraitOneIV.setFitWidth(60);
        portraitTwoIV.setFitWidth(60);

        //Allignment en Margins

        setMargin(btnHelp, new Insets(10, 20, 10, 50));
        setMargin(btnQuit,new Insets(10,20,10,50));
        setMargin(portraitOneIV, new Insets(10));
        setMargin(portraitTwoIV, new Insets(10,10,10,50));
        setMargin(angleOne, new Insets(10));
        setMargin(angleTwo, new Insets(10));
        setMargin(angleTFOne, new Insets(10));
        setMargin(angleTFTwo, new Insets(10));
        setMargin(powerOne, new Insets(10));
        setMargin(powerTwo, new Insets(10));
        setMargin(powerTFOne, new Insets(10));
        setMargin(powerTFTwo, new Insets(10));

        setHalignment(btnHelp, HPos.CENTER);
        setValignment(btnHelp, VPos.CENTER);
        setHalignment(btnQuit, HPos.CENTER);
        setValignment(btnQuit, VPos.CENTER);

        // Kolommen
        setColumnIndex(portraitOneIV, 0);
        setColumnIndex(powerOne, 1);
        setColumnIndex(angleOne, 1);
        setColumnIndex(powerTFOne, 2);
        setColumnIndex(angleTFOne, 2);
        setColumnIndex(btnHelp, 3);
        setColumnIndex(btnQuit, 3);
        setColumnIndex(powerTwo, 4);
        setColumnIndex(angleTwo, 4);
        setColumnIndex(powerTFTwo, 5);
        setColumnIndex(angleTFTwo, 5);
        setColumnIndex(portraitTwoIV, 6);

        //Rijen
        setRowIndex(btnQuit, 0);
        setRowIndex(portraitTwoIV, 0);
        setRowIndex(portraitOneIV, 0);
        setRowIndex(powerOne, 0);
        setRowIndex(powerTFOne, 0);
        setRowIndex(powerTFTwo, 0);
        setRowIndex(powerTwo, 0);
        setRowIndex(angleOne, 1);
        setRowIndex(angleTwo, 1);
        setRowIndex(angleTFOne, 1);
        setRowIndex(angleTFTwo, 1);
        setRowIndex(btnHelp, 1);
        setRowSpan(portraitOneIV, 2);
        setRowSpan(portraitTwoIV, 2);
        //setRowIndex(game, 3);


        getChildren().addAll(btnHelp, btnQuit, portraitOneIV, portraitTwoIV, powerOne, angleOne, powerTwo, angleTwo, powerTFOne, powerTFTwo, angleTFOne, angleTFTwo, gameGroup);
    }

    private void initialisatieNodes() {
        GridPane gridPane = new GridPane();
        gridPane.add(gameGroup,0,3,6,1);

        btnHelp = new Button("Help");
        btnQuit = new Button("Quit");
        portraitOneIV = new ImageView();
        portraitTwoIV = new ImageView();
        powerOne = new Label("Power:");
        powerTwo = new Label("Power:");
        angleOne = new Label("Angle:");
        angleTwo = new Label("Angle:");
        powerTFOne = new TextField();
        powerTFTwo = new TextField();
        angleTFOne = new TextField();
        angleTFTwo = new TextField();
        angleTFTwo.setEditable(false);
        angleTFOne.setEditable(false);
        powerTFOne.setEditable(false);
        powerTFTwo.setEditable(false);
        angleTFOne.setDisable(true);
        angleTFTwo.setDisable(true);
        powerTFOne.setDisable(true);
        powerTFTwo.setDisable(true);
        btnQuit.setDefaultButton(false);
        btnHelp.setDefaultButton(false);
    }


    public void setGcY(double[] gcY) {
        this.gcY = gcY;
    }

    public void setGcX(double[] gcX) {
        this.gcX = gcX;
    }

    public double[] getGcX() {
        return gcX;
    }

    public double[] getGcY() {
        return gcY;
    }

    public Button getBtnQuit() {
        return btnQuit;
    }

    public Button getBtnHelp() {
        return btnHelp;
    }

    public TextField getPowerTFOne() {
        return powerTFOne;
    }

    public TextField getAngleTFOne() {
        return angleTFOne;
    }

    public TextField getPowerTFTwo() {
        return powerTFTwo;
    }

    public TextField getAngleTFTwo() {
        return angleTFTwo;
    }

    public GameGroup getGameGroup() {
        return gameGroup;
    }
}
