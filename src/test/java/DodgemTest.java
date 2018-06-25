import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {
    Dodgem dodgem;

    @Before
    public void before(){
        dodgem = new Dodgem("Whiplash", 1);
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
}
