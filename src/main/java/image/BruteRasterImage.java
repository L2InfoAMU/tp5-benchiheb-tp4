package image;


import java.awt.*;

public class BruteRasterImage implements Image {
    private int height;
    private   int width;


    public BruteRasterImage(Color color, int width, int height){

        this.width=width;
        this.height=height;
    }





    public void setPixelColor(Color color, int x, int y){
        final Color pixelColor = getPixelColor(x, y);

    }


    private void setPixelsColor(Color[][] pixels){

        for(int i=0; i<width ;i++)
            for (int j = 0; j < height; j++) {

              pixels[i][j]= getPixelColor(i,j);
            }
    }

    private void setPixelsColor(Color color){
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
               Color pixelColor = getPixelColor(i,j);
               pixelColor=color;
            }
        }
    }

    public int getHeight() {
        return height;
    }


    public int getWidth(){
        return width;
    }

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

    public void createRepresentation(){

        int[][] window = new int[width][height];
    }











}
