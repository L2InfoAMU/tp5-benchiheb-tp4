package image;

import java.awt.*;

public class PaletteRasterImage implements Image {
    private Color color;
    private int width;
    private int height;

    public PaletteRasterImage(Color color, int width, int height){
        this.width=width;
        this.height=height;
        this.color=color;
    }

    public void createRepresentation(){
        private int[][] window = new int[width][height];
    }
}
