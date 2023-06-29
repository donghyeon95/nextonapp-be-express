import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    public void testCalc(){
        int sum = c.calc(100, 50, '+');
        assertEquals(150, sum, 0);

        int minus = c.calc(100, 50, '-');
        assertEquals(50, minus, 0);

        int multiply = c.calc(10, 50, '*');
        assertEquals(500, multiply, 0);

        int div = c.calc(10, 3, '/');
        assertEquals(3, div, 0);

//        int unknown = c.calc(10, 13, '?');
//        assertEquals(Integer.MIN_VALUE, unknown);
    }
}
