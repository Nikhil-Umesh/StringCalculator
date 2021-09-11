import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    private StringCalculator calculator;
    @Before
    public void initialize() {
        calculator = new StringCalculator();
    }

    @Test
    public void testEmptyStringShouldReturn0() {
        assertEquals(calculator.add(""), 0);
    }

    @Test
    public void testSingleNumberStringShouldReturnSameNumber() {
        assertEquals(calculator.add("1"), 1);
        assertEquals(calculator.add("2"), 2);
        assertEquals(calculator.add("76"), 76);
    }

    @Test
    public void testFor2Numbers() {
        assertEquals(calculator.add("1,2"), 3);
        assertEquals(calculator.add("71,33"), 104);
    }
}
