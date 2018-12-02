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
        int[][] window = new int[width][height];
    }

    public int getHeight() {
        return height;
    }


    public int getWidth(){
        return width;
    }
    protected void setHeight(int height){

        this.height = height;
    }

    protected void setWidth(int width){

        this.width = width;
    }
}
