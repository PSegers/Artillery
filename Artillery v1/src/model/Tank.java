package model;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 15:50
 */
public class Tank {
    private double xPos;
    private double yPos;
    private Player player;
    private Terrain terrain;
    Random generator = new Random();
    private int angle;
    private int power;

    // Constructor


    public Tank(Player player) {
        this.player = player;
    }

    public void genPosOne(Terrain terrain){
        int tempGen = (generator.nextInt(4)+3);
        xPos = terrain.getTerrainWidthAlt(tempGen);
        yPos = terrain.getTerrainHeightAlt(tempGen);
    }

    public void genPosTwo(Terrain terrain){
        int tempGen = (generator.nextInt(4)+15);
        xPos = terrain.getTerrainWidthAlt(tempGen);
        yPos = terrain.getTerrainHeightAlt(tempGen);
    }

    public int increaseAngle () {
        if (angle >= 90) {
            return angle = 90;
        }

        else {
            return angle++;
        }
    }

    public int increasePower () {
        if (power >= 10) {
            return power = 10;
        }
        else {
            return power++;
        }
    }

    // Decreasing values by 1 or multiple
    public int decreaseAngle () {
        if (angle <= 0) {
            return angle = 0;
        } else {
            return angle--;
        }
    }

    public int decreasePower () {
        if (power <= 1) {
            return power = 1;
        }
        else {
            return power--;
        }
    }

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public int getPower() {
        return power;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Player getPlayer() {
        return player;
    }

    public Terrain getTerrain() {
        return terrain;
    }
}
