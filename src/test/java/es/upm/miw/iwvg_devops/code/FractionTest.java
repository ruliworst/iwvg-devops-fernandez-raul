package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {
    @Test
    public void testDecimal() {
        Fraction fraction = new Fraction(4, 7);
        double decimal = fraction.decimal();
        double expectedDecimalValue = 0.5714;
        assertEquals(expectedDecimalValue, decimal, 10e-5);
    }

    @Test
    public void testDefaultConstructor() {
        Fraction fraction = new Fraction();
        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();
        int expectedNumerator = 1;
        int expectedDenominator = 1;
        assertEquals(expectedNumerator, numerator);
        assertEquals(expectedDenominator, denominator);
    }

    @Test
    public void testFractionAttributesAfterSetValues() {
        Fraction fraction = new Fraction();
        int expectedNumerator = 5;
        int expectedDenominator = 7;
        fraction.setNumerator(expectedNumerator);
        fraction.setDenominator(expectedDenominator);
        assertEquals(expectedNumerator, fraction.getNumerator());
        assertEquals(expectedDenominator, fraction.getDenominator());
    }
}
