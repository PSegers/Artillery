package view.options;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.start.StartPresenter;
import view.start.StartView;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 16:24
 */
public class TestMain extends Application {
    @Override
    public void start(Stage primaryStage){
        OptionsView view = new OptionsView();
        view.setId("pane");
        new OptionsPresenter(view);
        Scene scene = new Scene(view, 800, 600);
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Artillery");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
