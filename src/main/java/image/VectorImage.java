package image;

import java.awt.*;
import java.util.List;

public class VectorImage implements Image {
    private int height;
    private int width;
    private List<Shape> shapes;

    public VectorImage(List<Shape> shapes,int width, int height ) {
        this.height = height;
        this.width = width;
        this.shapes = shapes;
        new VectorImage(shapes,width,height);
    }

    public Color getPixelColor(int x, int y){
        return getPixelColor(x,y);

    }
}
