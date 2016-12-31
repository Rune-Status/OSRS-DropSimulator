package utils;

import javafx.util.Pair;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class Utils {

    private Utils() {}

//    public static final String getDigitsFromNum(int val, int digitStartIndex, int digitEndIndex) {
//        return Integer.toString(val).substring(digitStartIndex, digitEndIndex);
//    }

    public static final <T extends Number> String getDigitsFromNum(T val, int digitStartIndex, int digitEndIndex) {
        return val.toString().substring(digitStartIndex, digitEndIndex);
    }

    public static final double calcCenterXForImg(BufferedImage image, Rectangle rectangle) {
        return rectangle.x + ((rectangle.getWidth() - image.getWidth()) / 2);

    }

    public static final double calcBaselineYForImg(BufferedImage image, Rectangle rectangle) {
        return rectangle.y + rectangle.height - image.getHeight();
    }

    public static final Pair<Integer, Integer> calcCenterAlignForText(Rectangle bounds, Rectangle2D textBounds) {
        int x =(int) (bounds.getCenterX() - textBounds.getCenterX());
        int y = (int) (bounds.getCenterY() - textBounds.getCenterY());
        return new Pair<>(x, y);
    }

    public static final Pair<Integer, Integer> calcLeftAlignForText(Rectangle bounds, Rectangle2D textBounds) {
        int y = (int) (bounds.getCenterY() - textBounds.getCenterY());
        return new Pair<>(bounds.x, y);
    }
}
