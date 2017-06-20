package view.endgame;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import view.game.GamePresenter;
import view.game.GameView;
import view.start.StartPresenter;
import view.start.StartView;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 16:04
 */
public class EndgamePresenter {
    private EndgameView view;


    public EndgamePresenter(EndgameView view) {
        this.view = view;
        updateView();
        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getMainMenubtn().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                StartView startview = new StartView();
                new StartPresenter(startview);
                Scene scene = view.getScene();
                scene.setRoot(startview);
            }
        });
    }

    private void updateView() {
    }

}

