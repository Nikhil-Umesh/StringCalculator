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
        assertEquals(calculator.add("103,104"),207);
    }

    @Test
    public void testForUnknownNumberOfInputs() {
        assertEquals(calculator.add("1,2"), 3);
        assertEquals(calculator.add("71,33,1,103"), 208);
        assertEquals(calculator.add("103,104,11,12,5,7,1,12,99"),354);
    }

    @Test
    public void numbersNewlineDelimitedShouldBeSummed() {
        assertEquals(calculator.add("1\n2"), 3);
        assertEquals(calculator.add("11\n13"), 24);
        assertEquals(calculator.add("1,2\n3"), 6);
    }

    @Test
    public void differentDelimiter() {
        assertEquals(calculator.add("1;2"), 3);
    }
}
