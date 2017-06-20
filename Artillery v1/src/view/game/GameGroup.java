package view.game;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import javafx.animation.*;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.*;
import javafx.util.Duration;
import model.Faction;
import model.Tank;
import model.TerrainType;

import java.awt.geom.Point2D;


/**
 * @author Pieterjan Segers
 * @version 1.0 12-3-2016 22:33
 */
public class GameGroup extends Group {

    public GameGroup(double[] terrainSize, Tank tankOne, Tank tankTwo) {
        Group group = new Group();
        group.minHeight(480);
        group.maxHeight(480);
        group.minWidth(780);
        group.maxWidth(780);
        getStylesheets().add("css/stylesheet.css");
        Rectangle gameRect = new Rectangle(0,0,780,480);
        Rectangle tankOneRect = new Rectangle(tankOne.getxPos()-10, tankOne.getyPos()-10, 20, 10);
        Rectangle tankTwoRect = new Rectangle(tankTwo.getxPos()-10, tankTwo.getyPos()-10, 20,10);
        Polygon gamePoly = new Polygon(terrainSize);
        gameRect.setFill(new ImagePattern(new Image("/images/clouds.png")));
        gamePoly.setFill(tankOne.getTerrain().getTerrainType().getLandscape());
        tankOneRect.setFill(Color.YELLOW);
        tankTwoRect.setFill(Color.BEIGE);
        getChildren().addAll(gameRect, gamePoly, tankOneRect, tankTwoRect);
    }

}
