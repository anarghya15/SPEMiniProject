import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestScientificCalculator {

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, ScientificCalculator.squareRoot(4.0), 0.0001);
        assertEquals(3.0, ScientificCalculator.squareRoot(9.0), 0.0001);
        assertEquals(4.0, ScientificCalculator.squareRoot(16.0), 0.0001);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, ScientificCalculator.factorial(0), 0.0001);
        assertEquals(1, ScientificCalculator.factorial(1), 0.0001);
        assertEquals(120, ScientificCalculator.factorial(5), 0.0001);
        assertEquals(3628800, ScientificCalculator.factorial(10), 0.0001);
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0.0, ScientificCalculator.naturalLog(1.0), 0.0001);
        assertEquals(1.7917, ScientificCalculator.naturalLog(6.0), 0.0001);
        assertEquals(2.9957, ScientificCalculator.naturalLog(20.0), 0.0001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, ScientificCalculator.power(2.0, 3.0), 0.0001);
        assertEquals(27.0, ScientificCalculator.power(3.0, 3.0), 0.0001);
        assertEquals(64.0, ScientificCalculator.power(4.0, 3.0), 0.0001);
        assertEquals(1024.0, ScientificCalculator.power(2.0, 10.0), 0.0001);
    }
}

