package view.help;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.about.AboutView;

/**
 * @author Pieterjan Segers
 * @version 1.0 15-3-2016 12:52
 */
public class HelpPresenter {
    public HelpPresenter(HelpView view) {
        view.getBtnOk().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                view.getScene().getWindow().hide();
            }
        });
    }
}
