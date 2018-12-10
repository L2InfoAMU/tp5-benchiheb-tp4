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

    public void setPixelColor(Color color, int x, int y){
        this.setPixelColor(color,x,y);
    }
    public Color getPixelColor(int x, int y){
        return getPixelColor(x,y);
    }
    private void setPixelsColor(Color[][] pixels){
        for(int i=0;i<widht;i++){
            for(int j=0;j<height;j++){
                pixels[i][j]=getPixelColor(i,j);
            }
        }
    }

    public int getWidht() {
        return widht;
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

