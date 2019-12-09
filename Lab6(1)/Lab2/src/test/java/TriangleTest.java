import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class TriangleTest {
    @Test
    public void getA() {
        Triangle triangle = new Triangle(3, 4, 5);
        double expected = triangle.getA();
        assertEquals(expected, 3.0);
    }

    @Test
    public void testToString() {
        Triangle triangle = new Triangle(3, 4, 5);
        String expected = triangle.toString();
        assertEquals(expected, "Triangle{a=3.0, b=4.0, c=5.0, square=6.0}");
    }

    @Test
    public void square() {
        Triangle triangle = new Triangle(3, 4, 5);
        Double expected = triangle.square();
        Double actual = 6.0;
        assertEquals(expected, actual);
    }
}
