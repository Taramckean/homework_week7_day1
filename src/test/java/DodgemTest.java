import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {
    Dodgem dodgem;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        dodgem = new Dodgem("Whiplash", 10.6, 4);
        visitor1 = new Visitor("Campbell", 45, 210, 30);
        visitor2 = new Visitor("Richard", 6, 240, 20);
    }

    @Test
    public void canGetName(){
        assertEquals("Whiplash", dodgem.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, dodgem.getCapacity());
    }

    @Test
    public void canBump(){
        assertEquals("SMASH", dodgem.bump());
    }

    @Test
    public void canAddVisitorToDodgem(){
        dodgem.addVisitor(visitor1);
        assertEquals(1, dodgem.countVisitors());
    }

    @Test
    public void canCharge12YearOldsHalfPrice(){
        assertEquals(5.3, dodgem.defaultPrice(visitor2), 0.1);
    }
}
