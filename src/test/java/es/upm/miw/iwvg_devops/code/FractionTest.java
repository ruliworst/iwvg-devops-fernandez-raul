package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {
    Fraction firstFraction = new Fraction(1, 7);;
    Fraction secondFraction = new Fraction(2, 5);

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

    @Test
    public void testIsProper() {
        Fraction fraction = new Fraction(1, 2);
        assertTrue(fraction.isProper());
    }

    @Test
    public void testIsImproper() {
        Fraction fraction = new Fraction(5, 2);
        assertTrue(fraction.isImproper());
    }

    @Test
    public void testIsEquivalent() {
        assertFalse(firstFraction.isEquivalent(secondFraction));
    }

    @Test
    public void testAdd() {
        Fraction expectedFraction = new Fraction(19,  35);
        Fraction resultFraction = firstFraction.add(secondFraction);
        assertEquals(expectedFraction.getNumerator(), resultFraction.getNumerator());
        assertEquals(expectedFraction.getDenominator(), resultFraction.getDenominator());
    }

    @Test
    public void testMultiply() {
        Fraction expectedFraction = new Fraction(2,  35);
        Fraction resultFraction = firstFraction.multiply(secondFraction);
        assertEquals(expectedFraction.getNumerator(), resultFraction.getNumerator());
        assertEquals(expectedFraction.getDenominator(), resultFraction.getDenominator());
    }

    @Test
    public void testDivide() {
        Fraction expectedFraction = new Fraction(5,  14);
        Fraction resultFraction = firstFraction.divide(secondFraction);
        assertEquals(expectedFraction.getNumerator(), resultFraction.getNumerator());
        assertEquals(expectedFraction.getDenominator(), resultFraction.getDenominator());
    }
}
