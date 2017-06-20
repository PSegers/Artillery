package view.charSelect;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import model.*;
import view.charSelectTwo.CharSelectPresenterTwo;
import view.charSelectTwo.CharSelectViewTwo;

/**
 * @author Robin Thielemans
 * @version 1.0 11/03/2016 11:13.
 */
public class CharSelectPresenter {

    private CharSelectView view;
    private Player playerOne = new Player("Placeholder", Faction.NKorea);
    private Terrain terrain = new Terrain(TerrainType.HILLS);

    public CharSelectPresenter(CharSelectView view) {
        this.view = view;
        updateView();
        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getReadyBtn().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (view.getChinaRdbtn().isSelected()){
                    playerOne.setFaction(Faction.China);
                }
                else if (view.getEnglandRdbtn().isSelected()){
                    playerOne.setFaction(Faction.England);
                }
                else if (view.getUsaRdbtn().isSelected()){
                    playerOne.setFaction(Faction.USA);
                }
                else if (view.getUssrRdbtn().isSelected()){
                    playerOne.setFaction(Faction.USSR);
                }
                else if (view.getNaziRdbtn().isSelected()){
                    playerOne.setFaction(Faction.Nazi);
                }
                else if (view.getNkoreaRdbtn().isSelected()) {
                    playerOne.setFaction(Faction.NKorea);
                }
                else {
                    playerOne.setFaction(Faction.USA);
                }

                if (view.getHillsBtn().isSelected()){
                    terrain.setTerrainType(TerrainType.HILLS);
                }
                else if (view.getFlatBtn().isSelected()){
                    terrain.setTerrainType(TerrainType.FLAT);
                }
                else if (view.getMountnsBtn().isSelected()){
                    terrain.setTerrainType(TerrainType.MOUNTAINS);
                }
                else if (view.getPlainsBtn().isSelected()){
                    terrain.setTerrainType(TerrainType.PLAINS);
                }
                else {
                    terrain.setTerrainType(TerrainType.PLAINS);
                }

                if (view.getNameTF().getText() != null) {
                    playerOne.setName(view.getNameTF().getText());
                }
                else {
                    playerOne.setName("Player One");
                }


                CharSelectViewTwo charSelectViewTwo = new CharSelectViewTwo();
                new CharSelectPresenterTwo(charSelectViewTwo, playerOne, terrain);
                Scene scene = view.getScene();
                scene.setRoot(charSelectViewTwo);

            }
        });


    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    private void updateView() {
    }
}
