import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {
    Dodgem dodgem;
    Visitor visitor1;

    @Before
    public void before(){
        dodgem = new Dodgem("Whiplash", 1);
        visitor1 = new Visitor("Campbell", 45, 210, 30);
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
}
