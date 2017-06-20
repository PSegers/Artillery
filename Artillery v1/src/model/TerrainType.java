package model;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 17:39
 */
public enum TerrainType {
    HILLS(400,50,Color.BROWN),
    FLAT(400,1,Color.DARKGREEN),
    PLAINS(400,20, Color.GREENYELLOW),
    MOUNTAINS(400,100, Color.LIGHTGRAY);

    private int startHeight;
    private int margin;
    private Color landscape;

    TerrainType(int startHeight, int margin, Color landscape) {
        this.startHeight = startHeight;
        this.margin = margin;
        this.landscape = landscape;
    }

    public int getStartHeight() {
        return startHeight;
    }

    public int getMargin() {
        return margin;
    }

    public Color getLandscape() {
        return landscape;
    }
}
