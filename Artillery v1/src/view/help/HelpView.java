package view.help;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

/**
 * @author Pieterjan Segers
 * @version 1.0 15-3-2016 12:51
 */
public class HelpView extends BorderPane{
    private Button btnOk;
    public HelpView() {
        initialiseNodes();
        layoutNodes();
        getStylesheets().add("css/stylesheet.css");
    }

    private void initialiseNodes() {
        btnOk = new Button("Ok");
        btnOk.setPrefWidth(60);
    }

    private void layoutNodes() {
        //setCenter(new Image("/images/help.png"));
        setPadding(new Insets(10));
        BorderPane.setAlignment(btnOk, Pos.CENTER);
        BorderPane.setMargin(btnOk, new Insets(10, 0, 0, 0));
        setBottom(btnOk);
    }

    Button getBtnOk() {
        return btnOk;
    }
}
