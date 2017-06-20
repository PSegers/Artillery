package view.charSelect;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * @author Robin Thielemans
 * @version 1.0 11/03/2016 11:13.
 */
public class CharSelectView extends GridPane{

    private Rectangle upperRekt;
    private Label header;
    private Rectangle upperSmallRekt;
    private Label playerOneHeader;
    private Rectangle nameRekt;
    private TextField nameTF;
    private Label namelbl;
    private Rectangle factionRekt;
    private Label factionlbl;
    private RadioButton usaRdbtn;
    private RadioButton chinaRdbtn;
    private RadioButton ussrRdbtn;
    private RadioButton naziRdbtn;
    private RadioButton nkoreaRdbtn;
    private RadioButton englandRdbtn;
    private Button readyBtn;
    private Rectangle terrTypeRekt;
    private Label terrTypelbl;
    private RadioButton hillsBtn;
    private RadioButton plainsBtn;
    private RadioButton mountnsBtn;
    private RadioButton flatBtn;
    private Button loadbtn;
    private ToggleGroup factionsToggleGroup;
    private ToggleGroup terrainToggleGroup;



    public CharSelectView(){
        initialisatieNodes();
        layoutNodes();
        getStylesheets().add("css/stylesheet.css");
    }

    private void layoutNodes() {
        setPadding(new Insets(50));
        setAlignment(Pos.CENTER);


        setMargin(upperRekt, new Insets(0,0,0,0));
        setMargin(upperSmallRekt, new Insets(1,0,0,20));
        setMargin(header, new Insets(0,0,0,60));
        setMargin(playerOneHeader, new Insets(0,0,0,70));
        setMargin(nameRekt, new Insets(50,0,200,30));
        setMargin(namelbl, new Insets(50,0,200,50));
        setMargin(nameTF, new Insets(50,50,200,50));
        setMargin(factionRekt, new Insets(0,0,50,30));
        setMargin(factionlbl, new Insets(0,0,50,50));
        setMargin(usaRdbtn, new Insets(0,0,50, 50));
        setMargin(naziRdbtn, new Insets(0,0,50, 150));
        setMargin(nkoreaRdbtn, new Insets(0,0,50, 250));
        setMargin(ussrRdbtn, new Insets(70,0,50, 50));
        setMargin(chinaRdbtn, new Insets(70,0,50,150));
        setMargin(englandRdbtn, new Insets(70, 0,50,250));
        setMargin(readyBtn, new Insets(325, 0 , 50 ,275));
        setMargin(terrTypeRekt, new Insets(100,0,0,30));
        setMargin(terrTypelbl, new Insets(100,0,0,45));
        setMargin(hillsBtn, new Insets(100, 0, 0 ,50));
        setMargin(mountnsBtn, new Insets(100, 0 ,0, 150));
        setMargin(plainsBtn, new Insets(100,0,0,250));
        setMargin(flatBtn, new Insets(170,0,0,50));
        setMargin(loadbtn, new Insets(325, 0 ,50, 30));

        readyBtn.setMinHeight(30);
        readyBtn.setMinWidth(90);
        loadbtn.setMinWidth(90);
        loadbtn.setMinHeight(30);


        upperSmallRekt.setFill(Color.LIGHTGRAY);
        upperRekt.setFill(Color.LIGHTGRAY);
        nameRekt.setFill(Color.LIGHTGRAY);
        factionRekt.setFill(Color.LIGHTGRAY);
        terrTypeRekt.setFill(Color.LIGHTGRAY);


        setColumnIndex(upperRekt, 1);
        setColumnIndex(header, 2);
        setColumnSpan(upperRekt, 5);
        setColumnSpan(header, 2);
        setColumnSpan(nameRekt,1 );
        setColumnSpan(nameTF, 3);
        setColumnSpan(playerOneHeader, 2);
        setColumnIndex(upperSmallRekt, 2);
        setColumnIndex(playerOneHeader, 2);
        setColumnIndex(nameRekt, 1);
        setColumnIndex(namelbl, 1);
        setColumnIndex(nameTF, 2);
        setColumnIndex(factionRekt, 1);
        setColumnIndex(factionlbl, 1);
        setColumnIndex(usaRdbtn, 2);
        setColumnIndex(naziRdbtn, 2);
        setColumnIndex(ussrRdbtn, 2);
        setColumnIndex(nkoreaRdbtn, 2);
        setColumnIndex(chinaRdbtn, 2);
        setColumnIndex(englandRdbtn, 2);
        setColumnIndex(readyBtn, 2);
        setColumnIndex(terrTypeRekt, 1);
        setColumnIndex(terrTypelbl, 1);
        setColumnIndex(hillsBtn, 2);
        setColumnIndex(plainsBtn, 2);
        setColumnIndex(flatBtn, 2);
        setColumnIndex(mountnsBtn, 2);
        setColumnIndex(loadbtn, 1);


        setRowIndex(upperRekt, 0);
        setRowIndex(header, 0);
        setRowIndex(upperSmallRekt, 1);
        setRowIndex(playerOneHeader, 1);
        setRowIndex(nameRekt, 2);
        setRowIndex(namelbl, 2);
        setRowIndex(nameTF, 2);
        setRowIndex(factionRekt, 2);
        setRowIndex(factionlbl, 2);
        setRowIndex(usaRdbtn, 2);
        setRowIndex(naziRdbtn, 2);
        setRowIndex(ussrRdbtn, 2);
        setRowIndex(nkoreaRdbtn, 2);
        setRowIndex(chinaRdbtn, 2);
        setRowIndex(englandRdbtn, 2);
        setRowIndex(readyBtn, 2);
        setRowIndex(terrTypeRekt, 2);
        setRowIndex(terrTypelbl,2);
        setRowIndex(hillsBtn, 2);
        setRowIndex(plainsBtn, 2);
        setRowIndex(flatBtn, 2);
        setRowIndex(mountnsBtn, 2);
        setRowIndex(loadbtn, 2);


        getChildren().addAll( upperRekt, header, nameRekt ,namelbl, nameTF,factionRekt, factionlbl,
                usaRdbtn, naziRdbtn, nkoreaRdbtn, ussrRdbtn, chinaRdbtn, englandRdbtn, readyBtn, loadbtn,
                terrTypeRekt, terrTypelbl, hillsBtn, mountnsBtn, plainsBtn, flatBtn, upperSmallRekt, playerOneHeader);
    }

    private void initialisatieNodes() {

        upperRekt = new Rectangle(200,200,500,100);
        upperSmallRekt = new Rectangle(0, 0, 200,50);
        header = new Label("Character Selection");
        playerOneHeader = new Label("Player One");

        nameRekt = new Rectangle(40,0, 100, 33);
        nameTF = new TextField();
        namelbl = new Label("Name: ");

        factionRekt = new Rectangle(40,0,100,33);
        factionlbl = new Label("Faction: ");

        usaRdbtn = new RadioButton("USA");
        naziRdbtn = new RadioButton("NAZI");
        ussrRdbtn = new RadioButton("USSR");
        nkoreaRdbtn = new RadioButton("N-KOREA");
        chinaRdbtn = new RadioButton("CHINA");
        englandRdbtn = new RadioButton("ENGLAND");

        factionsToggleGroup = new ToggleGroup();
        usaRdbtn.setToggleGroup(factionsToggleGroup);
        naziRdbtn.setToggleGroup(factionsToggleGroup);
        ussrRdbtn.setToggleGroup(factionsToggleGroup);
        nkoreaRdbtn.setToggleGroup(factionsToggleGroup);
        chinaRdbtn.setToggleGroup(factionsToggleGroup);
        englandRdbtn.setToggleGroup(factionsToggleGroup);
        usaRdbtn.setSelected(true);

        readyBtn = new Button("READY");

        terrTypelbl = new Label("Terrain Type: ");
        terrTypeRekt = new Rectangle(40,0,100,33);

        hillsBtn = new RadioButton("Hills");
        plainsBtn = new RadioButton("Plains");
        mountnsBtn = new RadioButton("Mountains");
        flatBtn = new RadioButton("Flat");

        terrainToggleGroup= new ToggleGroup();
        hillsBtn.setToggleGroup(terrainToggleGroup);
        plainsBtn.setToggleGroup(terrainToggleGroup);
        mountnsBtn.setToggleGroup(terrainToggleGroup);
        flatBtn.setToggleGroup(terrainToggleGroup);
        hillsBtn.setSelected(true);

        loadbtn = new Button("LOAD");
    }

    public Rectangle getUpperRekt() {
        return upperRekt;
    }

    public ToggleGroup getFactionsToggleGroup() {
        return factionsToggleGroup;
    }

    public ToggleGroup getTerrainToggleGroup() {
        return terrainToggleGroup;
    }

    public Label getHeader() {
        return header;
    }

    public Rectangle getUpperSmallRekt() {
        return upperSmallRekt;
    }

    public Label getPlayerOneHeader() {
        return playerOneHeader;
    }

    public Rectangle getNameRekt() {
        return nameRekt;
    }

    public TextField getNameTF() {
        return nameTF;
    }

    public Label getNamelbl() {
        return namelbl;
    }

    public Rectangle getFactionRekt() {
        return factionRekt;
    }

    public Label getFactionlbl() {
        return factionlbl;
    }

    public RadioButton getUsaRdbtn() {
        return usaRdbtn;
    }

    public RadioButton getChinaRdbtn() {
        return chinaRdbtn;
    }

    public RadioButton getUssrRdbtn() {
        return ussrRdbtn;
    }

    public RadioButton getNaziRdbtn() {
        return naziRdbtn;
    }

    public RadioButton getNkoreaRdbtn() {
        return nkoreaRdbtn;
    }

    public RadioButton getEnglandRdbtn() {
        return englandRdbtn;
    }

    public Button getReadyBtn() {
        return readyBtn;
    }

    public Rectangle getTerrTypeRekt() {
        return terrTypeRekt;
    }

    public Label getTerrTypelbl() {
        return terrTypelbl;
    }

    public RadioButton getHillsBtn() {
        return hillsBtn;
    }

    public RadioButton getPlainsBtn() {
        return plainsBtn;
    }

    public RadioButton getMountnsBtn() {
        return mountnsBtn;
    }

    public RadioButton getFlatBtn() {
        return flatBtn;
    }

    public Button getLoadbtn() {
        return loadbtn;
    }
}
