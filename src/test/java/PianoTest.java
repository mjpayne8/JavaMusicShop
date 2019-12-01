import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Electronic", "Plastic", "Red");
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

}
