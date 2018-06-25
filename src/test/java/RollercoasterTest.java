import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;
    Visitor visitor1;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Stealth", 2);
        visitor1 = new Visitor("Campbell", 45, 210, 30);
    }

    @Test
    public void canGetName(){
        assertEquals("Stealth", rollercoaster.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, rollercoaster.getCapacity());
    }

    @Test
    public void canAddVisitorToRide(){
        rollercoaster.addVisitor(visitor1);
        assertEquals(1, rollercoaster.countVisitors());
    }



}
