import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;
    Visitor visitor1;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ice Cream Stall", "Richard", 2.8, 3);
        visitor1 = new Visitor("Jack", 23, 176, 80);
    }

    @Test
    public void canGetName() {
        assertEquals("Ice Cream Stall", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Richard", iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(3, iceCreamStall.getParkingNumber());
    }

    @Test
    public void canAddPersonToStall(){
        iceCreamStall.addVisitor(visitor1);
        assertEquals(1, iceCreamStall.countVisitors());
    }

    @Test
    public void canGetDefaultPrice(){
       assertEquals(2.8, iceCreamStall.defaultPrice(), 0.1);
    }

    @Test
    public void canGetPriceFor(){
        assertEquals(2.8, iceCreamStall.priceFor(visitor1), 0.1);
    }
}
