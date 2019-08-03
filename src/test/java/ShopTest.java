import Instruments.Guitar;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar1;
    Guitar guitar2;

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
        shop.addItemToStock(guitar1);
        assertEquals(1, shop.getStockQty());
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
