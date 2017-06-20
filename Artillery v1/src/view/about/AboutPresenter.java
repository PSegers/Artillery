package view.about;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 16:04
 */
public class AboutPresenter {
    public AboutPresenter(AboutView view) {
        view.getBtnOk().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.getScene().getWindow().hide();
            }
        });
    }
}
