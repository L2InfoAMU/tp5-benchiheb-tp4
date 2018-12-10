package image;


import java.awt.*;

public class BruteRasterImage extends RasterImage implements Image {
    private final RasterImage rasterImage = new RasterImage();


    public BruteRasterImage(Color color, int width, int height){

        this.rasterImage.setWidth(width);
        this.rasterImage.setHeight(height);
    }





    public void setPixelColor(Color color, int x, int y){

        rasterImage.setPixelColor(color, x, y);
    }


    private void setPixelsColor(Color[][] pixels){

        rasterImage.setPixelsColor(pixels);
    }

    private void setPixelsColor(Color color){
        rasterImage.setPixelsColor(color);
    }

    public int getHeight() {
        return rasterImage.getHeight();
    }


    public int getWidth(){
        return rasterImage.getWidth();
    }

    public Color getPixelColor(int x, int y) {
        return rasterImage.getPixelColor(x, y);
    }

    protected void setHeight(int height){

        rasterImage.setHeight(height);
    }

    protected void setWidth(int width){

        rasterImage.setWidth(width);
    }

    public void createRepresentation(){

        rasterImage.createRepresentation();
    }











}
