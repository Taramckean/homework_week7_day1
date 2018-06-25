import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;

    @Before
    public void before(){
        playground = new Playground("Tara's Park of Fun", 3, 50, 6);
        visitor1 = new Visitor("Campbell", 45, 210, 30);
    }

    @Test
    public void canGetName(){
        assertEquals("Tara's Park of Fun", playground.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(50, playground.getCapacity());
    }

    @Test
    public void canAddVisitorToPlayground(){
        playground.addVisitor(visitor1);
        assertEquals(1, playground.countVisitors());

    }

    @Test
    public void OldPeopleCantEnterPlayground(){
        assertEquals(false, playground.isAllowedTo(visitor1));
    }
}
