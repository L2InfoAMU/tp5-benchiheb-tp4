package image;

import image.RasterImage;

import java.awt.*;

public class SparseRasterImage extends RasterImage{
    private int widht;
    private int height;
    private Color color;

    public SparseRasterImage(int widht, int height, Color color) {
        this.widht = widht;
        this.height = height;
        this.color = color;
    }


    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }



    public int getHeight(){
        return height;
    }

    protected void setWidth(int width){
        this.widht=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }
}

