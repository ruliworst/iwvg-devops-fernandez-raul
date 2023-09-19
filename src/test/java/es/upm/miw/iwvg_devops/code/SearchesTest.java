package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {
    @Test
    public void testFindUserFamilyNameBySomeImproperFraction() {
        List<String> result = new Searches().findUserFamilyNameBySomeImproperFraction().toList();
        List<String> expectedFamilyNames = List.of("Fernandez", "Blanco", "López", "Torres");
        assertEquals(expectedFamilyNames, result);
    }

    @Test
    public void testFindUserIdByAllProperFraction() {
        List<String> result = new Searches().findUserIdByAllProperFraction().toList();
        List<String> expectedUserIds = List.of("7");
        assertEquals(expectedUserIds, result);
    }

    @Test
    public void testFindFractionMultiplicationByUserFamilyName() {
        Fraction result = new Searches().findFractionMultiplicationByUserFamilyName("Lozano");
        Fraction expectedFraction = new Fraction(-1, 30);
        assertEquals(expectedFraction.getNumerator(), result.getNumerator());
        assertEquals(expectedFraction.getDenominator(), result.getDenominator());
    }

    @Test
    public void testFindDecimalFractionByNegativeSignFraction() {
        List<Double> result = new Searches().findDecimalFractionByNegativeSignFraction().toList();
        List<Double> expectedDoubles = List.of(-0.2, -0.5, -0.0, -0.2);
        assertEquals(expectedDoubles, result);
    }
}
