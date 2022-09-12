package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor adult;
    Visitor child;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);

    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void priceForAdult(){
        adult = new Visitor(40, 180, 499.55);
        assertEquals(4.50, dodgems.priceFor(adult), 0.0);
    }

    @Test
    public void priceForChild() {
        child = new Visitor(10, 115, 10.00);
        assertEquals(2.25, dodgems.priceFor(child), 0.0);
    }
}
