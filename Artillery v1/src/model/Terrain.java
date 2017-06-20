package model;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 17:38
 */
public class Terrain {
    private TerrainType terrainType;
    Random generator = new Random();
    private double [] terrainSize = new double[46];
    private double [] terrainHeight = new double[23];
    private double[] terrainWidth = {
            0,0,39,78,117,156,195,234,273,312,351,390,429,468,507,546,585,624,663,702,741,780,780};
    private double scaleFactor = 1;

    public Terrain(TerrainType terrainType) {
        this.terrainType = terrainType;
    }

    public void genTerrainHeight (){
        terrainHeight[0] = 480 * scaleFactor;
        terrainHeight[1] = terrainType.getStartHeight() * scaleFactor;
        for (int i = 2; i < terrainHeight.length-1; i++) {
            int margin = generator.nextInt(terrainType.getMargin()) - (terrainType.getMargin()/2);
            if (margin > 0 && margin > (480-terrainHeight[i-1])) {
                margin = -margin;
            }
            if ((terrainHeight[i-1] + margin) > 138) {
                terrainHeight[i] = terrainHeight[i - 1] + margin;
            }
            else {
                terrainHeight[i] = terrainHeight[i-1] - margin;
            }
        }
        terrainHeight[22] = 480;
    }


    public double[] getTerrainWidth() {
        for (int i = 0; i < terrainWidth.length; i++) {
            terrainWidth[i] = terrainWidth[i]*scaleFactor;
        }
        return terrainWidth;
    }

    public double[] getTerrainHeight() {
        for (int i = 0; i < terrainHeight.length; i++) {
            terrainHeight[i] = terrainHeight[i]*scaleFactor;
        }
        return terrainHeight;
    }

    public double getTerrainWidthAlt(int j) {
        for (int i = 0; i < terrainWidth.length; i++) {
            terrainWidth[i] = terrainWidth[i]*scaleFactor;
        }
        return terrainWidth[j];
    }

    public double getTerrainHeightAlt(int j) {
        for (int i = 0; i < terrainHeight.length; i++) {
            terrainHeight[i] = terrainHeight[i]*scaleFactor;
        }
        return terrainHeight[j];
    }

    public double[] getTerrainSize() {
        terrainSize[0] = terrainWidth[0];
        terrainSize[1] = terrainHeight[0];
        for (int i = 1; i < terrainHeight.length; i++) {
            terrainSize[2*i] = terrainWidth[i];
            terrainSize[2*i+1] = terrainHeight[i];
        }
        return terrainSize;
    }

    public void setTerrainType(TerrainType terrainType) {
        this.terrainType = terrainType;
    }

    public void setScaleFactor(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    public TerrainType getTerrainType() {
        return terrainType;
    }


}
