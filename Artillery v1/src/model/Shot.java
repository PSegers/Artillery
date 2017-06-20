package model;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author Pieterjan Segers
 * @version 1.0 25-2-2016 15:50
 */
public class Shot {
    private Tank tank;
    private int angle;
    private int power;
    private int ballX;
    private int ballY;
    private InputStream inputStream;

    public Shot(Tank tank) {
        this.tank = tank;
    }

/*
    Assuming 360 degrees. Up = 90, Right = 0, Down = 270, Left = 180
     */

    // Setters
    public void setAngle(int angle) {
        this.angle = angle;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // Initiating the shot at the start of a game
    public void initiateShot (int angle, int power) {
        setAngle(0);
        setPower(0);
    }

    // Increasing values by 1 or multiple
    public int increaseAngle () {
        if (angle > 359) {
            return angle = 0;
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
        if (angle < 0) {
            return angle = 359;
        } else {
            return angle--;
        }
    }

    public int decreasePower () {
        if (power <= 0) {
            return power = 0;
        }
        else {
            return power--;
        }
    }

    /*
    Shot Arc -
    Assuming: Battlefield = 100x100
    Formula?
     */

    public int getShotX (int angle, int power, Tank tank) {
        int angleTemp = (int)Math.cos((double)angle);
        //ballX = tank.getxPos() + power * angleTemp; // tijd moet er nog bij
        return ballX;
    }

    public int getShotY (int angle, int power, Tank tank) {
        int angleTemp = (int)Math.sin((double)angle);
        //ballY = tank.getyPos() + power * angleTemp - 2; // tijd meot er nog bij
        return ballY;
    }

    public int getPower() {
        return power;
    }

    public int getAngle() {
        return angle;
    }
}
