import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Electronic",
                "Plastic",
                "Red",
                "Electric Keyboard",
                30,
                45);
    }

    @Test
    public void hasPianoType(){
        assertEquals("Electronic", piano.getPianoType());
    }

    @Test
    public void canPlay(){
        assertEquals("Twing", piano.play());
    }

    @Test
    public void canGetConstruction(){
        assertEquals("Plastic", piano.getConstruction());
    }

    @Test
    public void canGetColour(){
        assertEquals("Red", piano.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("Percussion", piano.getType());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Electric Keyboard", piano.getDescription());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(30, piano.getBoughtPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(45, piano.getSellPrice(), 0.001);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(0.5, piano.markUp(), 0.001);
    }

}
