package view.options;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.start.StartPresenter;
import view.start.StartView;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 16:04
 */
public class OptionsPresenter {
    private OptionsView view;

    public OptionsPresenter(OptionsView view) {
        this.view = view;
        updateView();
        addEventHandlers();
    }

    private void updateView() {

    }

    private void addEventHandlers() {
        view.getBtnClose().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                StartView startView= new StartView();
                new StartPresenter(startView);
                Scene scene = view.getScene();
                scene.setRoot(startView);
            }
        });

    }
}
