import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Trumpet trumpet;
    private Item item;

    @Before
    public void before(){
        shop = new Shop();
        trumpet = new Trumpet(3, "Black", "Trumpet", 30, 45);
        item = new Item("Queen Greatest Hits", "Sheet Music", 10,15);

    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddInstrument(){
        shop.addToStock(trumpet);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canAddItem(){
        shop.addToStock(item);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addToStock(item);
        shop.addToStock(trumpet);
        shop.removeFromStock(item);
        assertEquals(1, shop.stockCount());
    }

}
