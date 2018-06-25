import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before(){
        playground = new Playground("Tara's Park of Fun", 50);
        visitor = new Visitor("Adri", 28, 165, 50);
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
        playground.addVisitor(visitor);
        assertEquals(1, playground.countVisitors());

    }
}
