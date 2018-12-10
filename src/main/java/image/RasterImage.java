package image;

import java.awt.*;

public class RasterImage implements Image {
    int height;
    int width;

    public RasterImage() {
    }

    public void setPixelColor(Color color, int x, int y) {
        final Color pixelColor = null.getPixelColor(x, y);

    }

    void setPixelsColor(Color[][] pixels) {

        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++) {

                pixels[i][j] = null.getPixelColor(i, j);
            }
    }

    void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color pixelColor = null.getPixelColor(i, j);
                pixels = color;
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Color getPixelColor(int x, int y) {
        final Color pixelColor = null.getPixelColor(x, y);
        return pixelColor;
    }

    protected void setHeight(int height) {

        this.height = height;
    }

    protected void setWidth(int width) {

        this.width = width;
    }

    public void createRepresentation() {

        int[][] window = new int[width][height];
    }
}