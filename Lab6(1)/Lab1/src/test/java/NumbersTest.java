import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void dec2ans() throws Exception{
        Numbers numbers = new Numbers();
        numbers.input(1, 2 ,-3);
        String actual = numbers.output();
        String expected = "Корни уравнения: x1 = -3.0, x2 = 1.0";
        assertEquals(expected, actual);
    }


    @Test
    public void dec1ans() throws Exception{
        Numbers numbers = new Numbers();
        numbers.input(1, 2 ,1);
        String actual = numbers.output();
        String expected = "Уравнение не имеет действительных корней!";
        boolean b = expected.equals(actual);
//        assertEquals(expected, actual);
        assertFalse("Уравнение не имеет действительных корней!", b);

    }


    @Test
    public void dec0ans() throws Exception{
        Numbers numbers = new Numbers();
        numbers.input(3, 4 ,5);
        String actual = numbers.output();
        String expected = "Уравнение не имеет действительных корней!";
        assertEquals(expected, actual);
    }
}