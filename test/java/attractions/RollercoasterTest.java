package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor tallPerson;
    Visitor shortPerson;
    Visitor child;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void priceForTallPerson() {
        tallPerson = new Visitor(30, 201, 50.00);
        assertEquals(16.80, rollerCoaster.priceFor(tallPerson), 0.0);
    }

    @Test
    public void priceForShortPerson() {
        shortPerson = new Visitor(30, 170, 50.00);
        assertEquals(8.40, rollerCoaster.priceFor(shortPerson), 0.0);
    }

    @Test
    public void canChildRide() {
        child = new Visitor(10, 89, 10.0);
        assertEquals(false, rollerCoaster.isAllowed(child));
    }

    @Test
    public void whatIsTheReviewScore() {
        assertEquals(10, rollerCoaster.getRating());
    }
}
