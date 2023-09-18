package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void testUserSetMethods() {
        User user = new User();
        String expectedName = "Pedro";
        String expectedFamilyName = "Fernández";
        Fraction fraction = new Fraction(1, 5);
        List<Fraction> expectedFractions = List.of(fraction);
        user.setName(expectedName);
        user.setFamilyName(expectedFamilyName);
        user.setFractions(expectedFractions);
        assertEquals(expectedName, user.getName());
        assertEquals(expectedFamilyName, user.getFamilyName());
        assertEquals(expectedFractions, user.getFractions());
    }

    @Test
    public void testFullName() {
        User user = new User("b23m", "Pedro", "Fernández", new ArrayList<>());
        String expectedFullName = user.getName() + " " + user.getFamilyName();
        assertEquals(expectedFullName, user.fullName());
    }

    @Test
    public void testInitials() {
        User user = new User("b23m", "Pedro", "Fernández", new ArrayList<>());
        String expectedInitials = "P.";
        assertEquals(expectedInitials, user.initials());
    }
}
