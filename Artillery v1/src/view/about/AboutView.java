package view.about;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 16:04
 */
public class AboutView extends BorderPane {
    private Button btnOk;
    public AboutView() {
        initialiseNodes();
        layoutNodes();
        getStylesheets().add("css/stylesheet.css");
    }

    private void initialiseNodes() {
        btnOk = new Button("Ok");
        btnOk.setPrefWidth(60);
    }

    private void layoutNodes() {
        setCenter(new Label("Can't stump the Trump"));
        setPadding(new Insets(10));
        BorderPane.setAlignment(btnOk, Pos.CENTER);
        BorderPane.setMargin(btnOk, new Insets(10, 0, 0, 0));
        setBottom(btnOk);
    }

    Button getBtnOk() {
        return btnOk;
    }
}
