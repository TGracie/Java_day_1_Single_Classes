import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {
    Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkOnce(){
        assertEquals(90, bottle.drink(1));
    }

    @Test
    public void drinkTwice(){
        assertEquals(80, bottle.drink(2));
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, bottle.empty());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, bottle.fill());
    }

}
