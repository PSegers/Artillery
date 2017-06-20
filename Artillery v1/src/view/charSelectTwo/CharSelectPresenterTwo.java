package view.charSelectTwo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import model.*;
import view.charSelect.CharSelectPresenter;
import view.game.GameGroup;
import view.game.GamePresenter;
import view.game.GameView;

/**
 * @author Robin Thielemans
 * @version 1.0 13/03/2016 20:28.
 */
public class CharSelectPresenterTwo {
    private CharSelectViewTwo view;
    private Player playerOne;
    private Terrain terrain;
    private Player playerTwo = new Player("Placeholder", Faction.England);


    public CharSelectPresenterTwo (CharSelectViewTwo view, Player playerOne, Terrain terrain) {
        this.view = view;
        this.playerOne = playerOne;
        this.terrain = terrain;
        updateView();
        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getReadyBtn().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (view.getChinaRdbtn().isSelected()){
                    playerTwo.setFaction(Faction.China);
                }
                else if (view.getEnglandRdbtn().isSelected()){
                    playerTwo.setFaction(Faction.England);
                }
                else if (view.getUsaRdbtn().isSelected()){
                    playerTwo.setFaction(Faction.USA);
                }
                else if (view.getUssrRdbtn().isSelected()){
                    playerTwo.setFaction(Faction.USSR);
                }
                else if (view.getNaziRdbtn().isSelected()){
                    playerTwo.setFaction(Faction.Nazi);
                }
                else if (view.getNkoreaRdbtn().isSelected()) {
                    playerTwo.setFaction(Faction.NKorea);
                }
                else {
                    playerTwo.setFaction(Faction.China);
                }

                if (view.getNameTF().getText() != null) {
                    playerTwo.setName(view.getNameTF().getText());
                }
                else {
                    playerTwo.setName("Player One");
                }

                Tank tankOne = new Tank(playerOne);
                Tank tankTwo = new Tank(playerTwo);
                terrain.genTerrainHeight();
                tankOne.genPosOne(terrain);
                tankTwo.genPosTwo(terrain);
                tankOne.setPower(1);
                tankTwo.setPower(1);
                double terrainSize[] = terrain.getTerrainSize();

                GameGroup gameGroup = new GameGroup(terrainSize, tankOne, tankTwo);
                GameView gameView = new GameView(gameGroup);
                new GamePresenter(gameView, terrain, tankOne, tankTwo);
                Scene scene = view.getScene();
                scene.setRoot(gameView);
            }
        });

    }

    private void updateView() {
    }
}