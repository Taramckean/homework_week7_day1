import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeerStallTest {
    
    BeerStall beerStall;
    Visitor visitor1;
    Visitor visitor2;
    
    @Before 
    public void before(){
        beerStall = new BeerStall("Campbell Likes A Drink", "Campbell", 6.5, 210);
        visitor1 = new Visitor("Jack", 23, 176, 80);
        visitor2 = new Visitor("Richard", 14, 240, 20);
    }

    @Test
    public void canGetName() {
        assertEquals("Campbell Likes A Drink", beerStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Campbell", beerStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(210, beerStall.getParkingNumber());
    }

    @Test
    public void canAddPersonToStall(){
        beerStall.addVisitor(visitor1);
        assertEquals(1, beerStall.countVisitors());
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(6.5, beerStall.defaultPrice(), 0.1);
    }

    @Test
    public void canGetPriceFor(){
        assertEquals(6.5, beerStall.priceFor(visitor1), 0.1);
    }
}
