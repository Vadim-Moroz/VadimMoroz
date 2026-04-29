
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(55, calc.add(2, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(63, calc.multiply(2, 3));
    }
}