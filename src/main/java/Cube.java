/**
 * Created by Guest on 8/9/17.
 */
public class Cube {
    private Rectangle face;

    public Cube(Rectangle rectangle) {
        this.face = rectangle;
    }

    public Rectangle getFace() {
        return face;
    }

    public int getVolume() {
        int height = face.getHeight();
        return height * height * height;
    }

    public int getSurfaceArea() {
        return face.area() * 6;

    }
}
