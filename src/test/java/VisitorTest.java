import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Tara", 25, 179, 200);

    }

    @Test
    public void visitorHasName(){
        assertEquals("Tara", visitor.getName());
    }

    @Test public void canGetAge(){
        assertEquals(25, visitor.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(179, visitor.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(200, visitor.getMoney());
    }
}
