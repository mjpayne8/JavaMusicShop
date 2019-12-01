import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(3,
                "Yellow",
                "Trumpet",
                30,
                45);
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

    @Test
    public void canGetDescription(){
        assertEquals("Trumpet", trumpet.getDescription());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(30, trumpet.getBoughtPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(45, trumpet.getSellPrice(), 0.001);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(0.5, trumpet.markUp(), 0.001);
    }


}
