import attractions.*;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    Dodgems dodgems;
    Playground playground;
    Park park;
    Visitor visitor;
    Visitor child;
    Visitor tallVisitor;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        rollerCoaster = new RollerCoaster("Rolly", 10);
        dodgems = new Dodgems("Bumper Cars", 5);
        playground = new Playground("Fun Zone", 7);
        park = new Park("Leafy Meadows", 9);
        visitor = new Visitor(14, 1.2, 40.0);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        child = new Visitor(10, 89, 10.0);
        tallVisitor = new Visitor(30, 201, 50.00);
        ArrayList<Visitor> visitors= new ArrayList<>();
        visitors.add(visitor);
        visitors.add(child);
        visitors.add(tallVisitor);
        ArrayList<Stall> stalls = new ArrayList<>();
        stalls.add(candyflossStall);
        stalls.add(iceCreamStall);
        stalls.add(tobaccoStall);
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(rollerCoaster);
        attractions.add(dodgems);
        attractions.add(playground);
        attractions.add(park);
        themePark = new ThemePark(visitors, stalls, attractions);
    }

    @Test
    public void totalAttaractionRating() {
        assertEquals(31, themePark.getAllReviewed());
    }

    @Test
    public void attractionVisited() {
        themePark.attractionVisited(rollerCoaster, visitor);
        assertEquals(1, rollerCoaster.getVisitCount());
        assertEquals(1, visitor.getNumberOfAttractionsVisited());
    }
}
