package view.endgame;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 16:04
 */
public class EndgameView extends GridPane{
    private Button mainMenubtn;
    private Label playerOnelbl;
    private Label factionOnelbl;
    private ImageView portraitOne;
    private Label submessageOne;
    private Rectangle rektoOne;
    private Rectangle rektoUpOne;

    private Rectangle rektoSplitter;

    private Label playerTwolbl;
    private Label factionTwolbl;
    private ImageView portraitTwo;
    private Label submessageTwo;
    private Rectangle rektoTwo;
    private Rectangle rektoUpTwo;





    public EndgameView() {
        initialisatieNodes();
        layoutNodes();
        getStylesheets().add("css/stylesheet.css");
    }

    private void layoutNodes() {
        setPadding(new Insets(50));

        setMargin(mainMenubtn, new Insets(0,0,0,0));
        setMargin(playerOnelbl, new Insets(0,0,0,200));
        setMargin(portraitOne, new Insets(50,0,0,175));
        setMargin(factionOnelbl, new Insets(50,0,0,275));
        setMargin(submessageOne, new Insets(30,0,0,225));
        setMargin(rektoOne, new Insets(50,0,0,200));
        setMargin(rektoUpOne, new Insets(0,0,0,175));

        setMargin(rektoSplitter, new Insets(40,0,0,0));

        setMargin(playerTwolbl, new Insets(15,0,0,200));
        setMargin(portraitTwo, new Insets(50,0,0,175));
        setMargin(factionTwolbl, new Insets(50,0,0,275));
        setMargin(submessageTwo, new Insets(30,0,0,225));
        setMargin(rektoTwo, new Insets(50,0,0,200));
        setMargin(rektoUpTwo, new Insets(10,0,0,175));



        portraitOne.setImage(new Image("/images/trump.png"));
        portraitTwo.setImage(new Image("/images/osama.png"));
        portraitTwo.setFitHeight(90);
        portraitOne.setFitHeight(90);
        portraitOne.setFitWidth(70);
        portraitTwo.setFitWidth(70);

        rektoUpOne.setFill(Color.LIGHTGRAY);
        rektoUpTwo.setFill(Color.LIGHTGRAY);
        rektoOne.setFill(Color.LIGHTGRAY);
        rektoTwo.setFill(Color.LIGHTGRAY);


        setColumnIndex(mainMenubtn,0);
        setColumnIndex(playerOnelbl, 1);
        setColumnSpan(playerOnelbl, 3);
        setColumnIndex(portraitOne, 1);
        setColumnIndex(factionOnelbl, 1);
        setColumnIndex(submessageOne,1);
        setColumnSpan(submessageOne, 2);
        setColumnIndex(rektoOne,0);
        setColumnSpan(rektoOne, 4);
        setColumnIndex(rektoUpOne, 1);
        setColumnSpan(rektoUpOne, 3);

        setColumnIndex(rektoSplitter, 0);
        setColumnSpan(rektoSplitter, 4);

        setColumnIndex(playerTwolbl,1);
        setColumnSpan(playerTwolbl, 3);
        setColumnIndex(portraitTwo, 1);
        setColumnIndex(factionTwolbl, 1);
        setColumnIndex(submessageTwo,1);
        setColumnSpan(submessageTwo, 2);
        setColumnIndex(rektoTwo,0);
        setColumnSpan(rektoTwo, 4);
        setColumnIndex(rektoUpTwo, 1);
        setColumnSpan(rektoUpTwo, 3);

        setRowIndex(mainMenubtn, 0);
        setRowIndex(playerOnelbl, 0);
        setRowIndex(portraitOne, 1);
        setRowIndex(factionOnelbl, 1);
        setRowIndex(submessageOne, 2);
        setRowIndex(rektoOne, 1);
        setRowSpan(rektoOne,2);
        setRowIndex(rektoUpOne, 0);

        setRowIndex(rektoSplitter,3);

        setRowIndex(playerTwolbl, 4);
        setRowIndex(portraitTwo, 5);
        setRowIndex(factionTwolbl, 5);
        setRowIndex(submessageTwo, 6);
        setRowIndex(rektoTwo, 5);
        setRowSpan(rektoTwo,6);
        setRowIndex(rektoUpTwo, 4);


        getChildren().addAll(mainMenubtn, rektoOne, rektoUpOne, rektoTwo,rektoUpTwo, playerOnelbl, portraitOne, factionOnelbl, submessageOne,
                rektoSplitter, playerTwolbl, portraitTwo, factionTwolbl, submessageTwo);

    }

    private void initialisatieNodes() {
        mainMenubtn = new Button("Main Menu");
        playerOnelbl = new Label("Player One [name]");
        portraitOne = new ImageView();
        factionOnelbl = new Label("[Faction] [Wins]");
        submessageOne = new Label("[Submessage]");
        rektoOne = new Rectangle(0,0,300,200);
        rektoUpOne = new Rectangle(0,0, 200, 40);

        rektoSplitter = new Rectangle(0,0,700,1);

        playerTwolbl = new Label("Player Two [name]");
        portraitTwo = new ImageView();
        factionTwolbl = new Label("[Faction] [Wins]");
        submessageTwo = new Label("[Submessage]");
        rektoTwo = new Rectangle(0,0,300,200);
        rektoUpTwo = new Rectangle(0,0, 200, 40);


    }

    public Button getMainMenubtn() {
        return mainMenubtn;
    }

    public Label getPlayerOnelbl() {
        return playerOnelbl;
    }

    public Label getFactionOnelbl() {
        return factionOnelbl;
    }

    public ImageView getPortraitOne() {
        return portraitOne;
    }

    public Label getSubmessageOne() {
        return submessageOne;
    }

    public Rectangle getRektoOne() {
        return rektoOne;
    }

    public Rectangle getRektoUpOne() {
        return rektoUpOne;
    }

    public Rectangle getRektoSplitter() {
        return rektoSplitter;
    }

    public Label getPlayerTwolbl() {
        return playerTwolbl;
    }

    public Label getFactionTwolbl() {
        return factionTwolbl;
    }

    public ImageView getPortraitTwo() {
        return portraitTwo;
    }

    public Label getSubmessageTwo() {
        return submessageTwo;
    }

    public Rectangle getRektoTwo() {
        return rektoTwo;
    }

    public Rectangle getRektoUpTwo() {
        return rektoUpTwo;
    }
}
