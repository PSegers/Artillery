package view.game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

/**
 * @author Pieterjan Segers
 * @version 1.0 10-3-2016 16:02
 */
public class TestMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        /*Player playerOne = new Player("test", Faction.England);
        Player playerTwo = new Player("test", Faction.England);
        Tank tankOne = new Tank(playerOne);
        Tank tankTwo = new Tank(playerTwo);
        Shot shotOne = new Shot(tankOne);
        Shot shotTwo = new Shot(tankTwo);
        Terrain terrain = new Terrain(TerrainType.Hills);
        terrain.genTerrainHeight();
        tankOne.genPosOne(terrain);
        tankTwo.genPosTwo(terrain);
        boolean turnOne = true; // True = player one turn .... False = player two turn
        double terrainSize[] = terrain.getTerrainSize();
        double tankOneX = tankOne.getxPos();
        double tankTwoX = tankTwo.getxPos();
        double tankOneY = tankOne.getyPos();
        double tankTwoY = tankTwo.getyPos();
        int angleOne = shotOne.getAngle();

        GameGroup gameGroup = new GameGroup(terrainSize, tankOne, tankTwo);
        GameView view = new GameView(gameGroup);
        view.setId("pane");
        new GamePresenter(view);
        Scene scene = new Scene(view, 800, 600);
        primaryStage.setResizable(false);
//        scene.getStylesheets().addAll(this.getClass().getResource("stylesheet.css").toExternalForm());
        //scene.getStylesheets().addAll(this.getClass().getResource("../start/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Artillery");
        primaryStage.show();

        view.getAngleTFOne().setText(Integer.toString(shotOne.getAngle()));
        view.getAngleTFTwo().setText(Integer.toString(shotTwo.getAngle()));
        view.getPowerTFOne().setText(Integer.toString(shotOne.getPower()));
        view.getPowerTFTwo().setText(Integer.toString(shotTwo.getPower()));*/
    }

    public static void main(String[] args) {
        launch(args);
    }
}
