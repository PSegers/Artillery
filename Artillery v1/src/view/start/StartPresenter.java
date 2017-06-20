package view.start;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import view.about.AboutPresenter;
import view.about.AboutView;
import view.charSelect.CharSelectPresenter;
import view.charSelect.CharSelectView;
import view.options.OptionsPresenter;
import view.options.OptionsView;

import java.util.Optional;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 16:05
 */
public class StartPresenter {
    private StartView view;

    public StartPresenter(StartView view) {
        this.view = view;
        updateView();
        addEventHandlers();
    }

    private void updateView() {

    }

    private void addEventHandlers() {
        view.getBtnQuit().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();

            }
        });

        view.getBtnAbout().setOnAction(new EventHandler<ActionEvent>() {
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
        view.getBtnOptions().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                OptionsView optionsView = new OptionsView();
                new OptionsPresenter(optionsView);
                Scene scene = view.getScene();
                scene.setRoot(optionsView);
            }
        });

        view.getBtnNewGame().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                CharSelectView charSelectView = new CharSelectView();
                new CharSelectPresenter(charSelectView);
                Scene scene = view.getScene();
                scene.setRoot(charSelectView);
            }
        });
    }
}




