package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor = new Visitor(21, 210, 50);

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
    public void canChargeDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(),0.01);

    }

    @Test
    public void canRideRollerCoaster(){
        assertEquals(true, rollerCoaster.isAllowedToRide(visitor));
    }

    @Test
    public void canChargeTallVisitors(){
        assertEquals(16.8, rollerCoaster.priceFor(visitor), 0.01);
    }

}
