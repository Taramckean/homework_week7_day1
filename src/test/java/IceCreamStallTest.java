import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;
    Visitor visitor1;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ice Cream Stall", "Richard", 3);
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
}
