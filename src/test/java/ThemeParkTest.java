import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
   ThemePark themePark;
   Rollercoaster rollercoaster1;

   @Before
    public void setUp(){
       themePark = new ThemePark("TaraTowers", 10000);
       rollercoaster1 = new Rollercoaster("Stealth", 2);

   }

   @Test
    public void canGetName(){
       assertEquals("TaraTowers", themePark.getName());
   }

   @Test
    public void canGetCapacity(){
       assertEquals(10000, themePark.getCapacity());
   }

   @Test
    public void canAddAttractions(){
       themePark.add()
       assertEquals(1, themePark.countAttractions());
   }

}
