package image;

import java.awt.*;

public class BruteRasterImage implements Image {
    public int height;
    public  int width;
    public Color color;


    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth(){
        return width;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        final Color pixelColor = getPixelColor (x, y);
        return pixelColor;
    }

    protected void setHeight(int height){

        this.height = height;
    }

    protected void setWidth(int width){

        this.width = width;
    }








}
