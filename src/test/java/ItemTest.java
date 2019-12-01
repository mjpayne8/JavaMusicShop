import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    private Item item;

    @Before
    public void before(){
        item = new Item("Queen Greatest Hits", "Sheet Music", 10,15);
    }

    @Test
    public void getName(){
        assertEquals("Queen Greatest Hits", item.getName());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Sheet Music", item.getDescription());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(10, item.getBoughtPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(15, item.getSellPrice(), 0.001);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(0.5, item.markUp(), 0.001);
    }

}
