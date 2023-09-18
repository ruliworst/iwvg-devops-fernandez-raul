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
}
