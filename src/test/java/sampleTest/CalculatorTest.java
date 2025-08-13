package sampleTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    public int testadd(int a, int b) {
        return a + b;
    }
    @Test
    void testAddition() {
        CalculatorTest cop = new CalculatorTest();
        int result = cop.testadd(3, 4);
        assertEquals(7, result, "Expected 3 + 4 to equal 7");
    }
}
