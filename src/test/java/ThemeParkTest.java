import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
   ThemePark themePark;
   Rollercoaster rollercoaster1;
   Visitor visitor1;

   @Before
    public void setUp(){
       themePark = new ThemePark("TaraTowers", 20.5, 10000);
       rollercoaster1 = new Rollercoaster("Stealth", 4, 2);
       visitor1 = new Visitor("Richard", 18, 210, 30);

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
       themePark.addToThemePark(rollercoaster1);
       assertEquals(1, themePark.countAttractions());
   }

   @Test
    public void canAddVisitorsToAttractions(){
       themePark.addToThemePark(rollercoaster1);
       rollercoaster1.addVisitor(visitor1);
       assertEquals(1, themePark.countAttractions());
       assertEquals(1, rollercoaster1.countVisitors());

   }


}
