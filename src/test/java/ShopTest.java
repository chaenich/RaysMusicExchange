import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void setup() {
        shop = new Shop();
    }

    @Test
    public void canGetStockQtyNoStock() {
        assertEquals(0, shop.getStockQty());
    }
}
