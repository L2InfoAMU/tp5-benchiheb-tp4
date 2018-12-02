package image;

import java.awt.*;

public class PaletteRasterImage implements Image {
    private Color color;
    private int width;
    private int height;

    public PaletteRasterImage(Color color, int width, int height) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void createRepresentation() {
        int[][] window = new int[width][height];
    }

    public int getHeight() {
        return height;
    }


    public int getWidth() {
        return width;
    }

    protected void setHeight(int height) {

        this.height = height;
    }

    protected void setWidth(int width) {

        this.width = width;
    }

    public Color getPixelColor(int x, int y) {
        final Color pixelColor = getPixelColor (x, y);
        return pixelColor;

    }

    public void setPixelsColor(Color[][] pixels){
        for(int i=0; i<width ;i++)
            for (int j = 0; j < height; j++) {
                getPixelColor(i,j)=pixels[i][j];
            }
    }
}