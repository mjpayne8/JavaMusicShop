import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Bass",4, "Plastic", "Yellow");
    }

    @Test
    public void hasGuitarType(){
        assertEquals("Bass", guitar.getGuitarType());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(4, guitar.getNumberOfSrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Twang", guitar.play());
    }

    @Test
    public void canGetConstruction(){
        assertEquals("Plastic", guitar.getConstruction());
    }

    @Test
    public void canGetColour(){
        assertEquals("Yellow", guitar.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals("String", guitar.getType());
    }

}
