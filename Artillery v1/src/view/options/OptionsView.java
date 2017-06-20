package view.options;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 16:04
 */
public class OptionsView extends VBox {

    private Button btnOptions;
    private Button btnClose;

    public OptionsView() {
        initialiseNodes();
        layoutNodes();
        getStylesheets().add("css/stylesheet.css");
        setId("pane");
    }

    private void layoutNodes() {

        setSpacing(20);
        setAlignment(Pos.CENTER);


        btnClose.setMinHeight(30);
        btnClose.setMinWidth(100);
        btnOptions.setMinWidth(100);
        btnOptions.setMinHeight(30);
        VBox.setMargin(btnClose, new Insets(10));
        VBox.setMargin(btnOptions, new Insets(10));

        getChildren().addAll(btnOptions , btnClose);


    }

    private void initialiseNodes() {
        VBox vbox = new VBox(500);

        btnOptions = new Button("Options");
        btnClose = new Button("Menu");

    }

    public Button getBtnOptions() {
        return btnOptions;
    }

    public Button getBtnClose() {
        return btnClose;
    }
}
