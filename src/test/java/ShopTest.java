import Instruments.Guitar;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;

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
        guitar = new Guitar("Lovely sounding strings", 45.00, 75.00,
                "Electric", "Red", "Wood-Plastic", 6);
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getStockQty());
    }
}
