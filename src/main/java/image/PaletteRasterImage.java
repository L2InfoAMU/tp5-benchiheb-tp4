package image;

import java.awt.*;

public class PaletteRasterImage extends RasterImage implements Image {
    private final RasterImage rasterImage = new RasterImage(this);
    private int height;
    private Color[][] pixels;

    public PaletteRasterImage(Color color, int width, int height) {
        this.rasterImage.setWidth(width);
        this.height = height;
        this.rasterImage.setColor(color);
    }

    public void createRepresentation() {
        rasterImage.createRepresentation();
    }

    public int getHeight() {
        return rasterImage.getHeight();
    }


    public int getWidth() {
        return rasterImage.getWidth();
    }

    protected void setHeight(int height) {

        rasterImage.setHeight(height);
    }

    protected void setWidth(int width) {

        rasterImage.setWidth(width);
    }

    public Color getPixelColor(int x, int y) {

        return rasterImage.getPixelColor(x, y);
    }

    public void setPixelsColor(Color[][] pixels){
        rasterImage.setPixelsColor(pixels);
    }

    public void setPixelColor(Color color, int x, int y){

        rasterImage.setPixelColor(color, x, y);
    }

    private void setPixelsColor(Color color){

        rasterImage.setPixelsColor(color);
    }

    public int getHeight() {
        return height;
    }

    public Color[][] getPixels() {
        return pixels;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static class RasterImage implements Image {
        private final PaletteRasterImage paletteRasterImage;
        private Color color;

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        private int width;

        public RasterImage(PaletteRasterImage paletteRasterImage) {
            this.paletteRasterImage = paletteRasterImage;
        }

        public void createRepresentation() {
            int[][] window = new int[width][paletteRasterImage.getHeight()];
        }

        public int getHeight() {
            return paletteRasterImage.getHeight();
        }

        public int getWidth() {
            return width;
        }

        protected void setHeight(int height) {

            paletteRasterImage.setHeight(height);
        }

        protected void setWidth(int width) {

            this.width = width;
        }

        public Color getPixelColor(int x, int y) {
            final Color pixelColor = paletteRasterImage.getPixelColor(x, y);
            return pixelColor;

        }

        public void setPixelsColor(Color[][] pixels) {
            for (int i = 0; i < width; i++)
                for (int j = 0; j < paletteRasterImage.getHeight(); j++) {
                    pixels[i][j] = color;
                }
        }

        public void setPixelColor(Color color, int x, int y) {
            if (paletteRasterImage.getPixels()[x][y] != color) {
                paletteRasterImage.getPixels()[x][y] = color;
            } else {
                paletteRasterImage.getPixels()[x][y] = color;
            }

        }

        private void setPixelsColor(Color color) {

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < paletteRasterImage.getHeight(); j++) {

                    paletteRasterImage.getPixels()[i][j] = color;
                }
            }
        }
    }
}