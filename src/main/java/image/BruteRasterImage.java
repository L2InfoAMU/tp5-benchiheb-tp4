package image;

import java.awt.Color;

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




}
