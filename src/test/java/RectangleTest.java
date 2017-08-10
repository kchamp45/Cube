import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/9/17.
 */
public class RectangleTest {
    @Test
    public void getHeight() throws Exception {
    }

    @Test
    public void getWidth() throws Exception {
    }

    @Test
    public void getAll() throws Exception {
    }

    @Test
    public void getShape() throws Exception {
    }

    @Test
    public void isRectSquare() throws Exception {
    }

    @Test
    public void area_returnsTheAreaOfTheRectangle_450() throws Exception{
        Rectangle testRectangle = new Rectangle(15, 30);
        assertEquals(450, testRectangle.area());
    }

}