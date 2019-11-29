import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Electronic");
    }

    @Test
    public void hasPianoType(){
        assertEquals("Electronic", piano.getPianoType());
    }

    @Test
    public void canPlay(){
        assertEquals("Twing", piano.play());
    }

}
