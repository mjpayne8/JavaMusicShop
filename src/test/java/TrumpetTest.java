import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(3, "Yellow");
    }

    @Test
    public void hasNumberOFValves(){
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Toot", trumpet.play());
    }

    @Test
    public void canGetConstruction(){
        assertEquals("Metal", trumpet.getConstruction());
    }

    @Test
    public void canGetColour(){
        assertEquals("Yellow", trumpet.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("Brass", trumpet.getType());
    }


}
