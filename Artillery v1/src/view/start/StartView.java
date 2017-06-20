package view.start;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;


/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 16:03
 */
public class StartView extends VBox {
    private Button btnNewGame;
    private Button btnOptions;
    private Button btnAbout;
    private Button btnQuit;

    public StartView() {
        initialiseNodes();
        layoutNodes();
        getStylesheets().add("css/stylesheet.css");
        setId("pane");

    }

    private void layoutNodes() {
        setAlignment(Pos.CENTER);

        btnNewGame.setMinHeight(30);
        btnNewGame.setMinWidth(100);
        btnOptions.setMinWidth(100);
        btnOptions.setMinHeight(30);
        btnAbout.setMinHeight(30);
        btnAbout.setMinWidth(100);
        btnQuit.setMinHeight(30);
        btnQuit.setMinWidth(100);

        VBox.setMargin(btnNewGame, new Insets(10));
        VBox.setMargin(btnQuit, new Insets(10));
        VBox.setMargin(btnAbout, new Insets(10));
        VBox.setMargin(btnOptions, new Insets(10));
        getChildren().addAll(btnNewGame,  btnOptions , btnAbout , btnQuit );
    }

    private void initialiseNodes() {
        VBox vbox = new VBox(25);
        btnNewGame = new Button("New Game");
        btnNewGame.getStyleClass().add("button");
        btnQuit = new Button("Quit");
        btnOptions = new Button("Options");
        btnAbout = new Button("About");
    }

    Button getBtnNewGame() {
        return btnNewGame;
    }

    Button getBtnOptions() {
        return btnOptions;
    }

    Button getBtnQuit() {
        return btnQuit;
    }

    Button getBtnAbout() {
        return btnAbout;
    }
}

