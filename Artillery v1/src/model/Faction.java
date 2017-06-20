package model;

import javafx.scene.paint.Color;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 15:57
 */
public enum Faction {
    USA (Color.BLUE, "We'll make America great again!"),
    Nazi (Color.BLACK, "Fur den Fuhrer"),
    USSR (Color.RED, "Cyka blyat"),
    NKorea (Color.PURPLE, "Placeholder"),
    England (Color.WHITE, "Placeholder"),
    China (Color.GREEN, "Placeholder");

    private Color tankColor;
    private String quote;
    // private Music themeSong; // met muziek en audio quote in

    Faction(Color tankColor, String quote){
        this.tankColor = tankColor;
        this.quote = quote;
    }

    public Color getTankColor() {
        return tankColor;
    }

    public String getQuote() {
        return quote;
    }
}
