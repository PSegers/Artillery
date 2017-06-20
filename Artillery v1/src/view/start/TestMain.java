package view.start;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.Optional;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 16:24
 */
public class TestMain extends Application {
    @Override
    public void start(Stage primaryStage){
        StartView view = new StartView();
        view.setId("pane");
        new StartPresenter(view);
        Scene scene = new Scene(view, 800, 600);
        primaryStage.setResizable(false);
//        scene.getStylesheets().addAll(this.getClass().getResource("css/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Artillery");
        primaryStage.show();

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                final Alert areYouSure = new Alert(Alert.AlertType.CONFIRMATION);
                areYouSure.setContentText("Are You sure you want to quit?");
                Optional<ButtonType> choice = areYouSure.showAndWait();
                if (choice.get().getText().equalsIgnoreCase("CANCEL")) {
                    event.consume();
                }
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
