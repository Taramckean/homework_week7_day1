import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Stealth", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Stealth", rollercoaster.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, rollercoaster.getCapacity());
    }
}
