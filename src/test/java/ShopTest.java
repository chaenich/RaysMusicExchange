import Instruments.Flute;
import Instruments.Guitar;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar1;
    Guitar guitar2;
    Flute flute1;

    @Before
    public void setup() {
        shop = new Shop();
    }

    @Test
    public void canGetStockQtyNoStock() {
        assertEquals(0, shop.getStockQty());
    }

    @Test
    public void canAddItemToStock() {
        guitar1 = new Guitar("Lovely sounding strings", 45.00, 75.00,
                "Electric", "Red", "Wood-Plastic", 6);
        flute1 = new Flute("Lovely flute", 22.00, 35.00,
                "Picoloe", "Bronzey", "Copper", 8);
        shop.addItemToStock(guitar1);
        shop.addItemToStock(flute1);
        assertEquals(2, shop.getStockQty());
    }


    @Test
    public void canRemoveItemFromStock() {
        guitar1 = new Guitar("Lovely sounding strings", 45.00, 75.00,
                "Electric", "Red", "Wood-Plastic", 6);
        guitar2 = new Guitar("Rubbish guitar", 25.00, 26.00,
                "Acoustic", "Brown", "Plastic", 4);
        shop.addItemToStock(guitar1);
        shop.addItemToStock(guitar2);
        assertEquals(2, shop.getStockQty());
        shop.removeItemFromStock(guitar2);
        assertEquals(1, shop.getStockQty());

    }
}
