import Accessories.Sheet;
import Instruments.Flute;
import Instruments.Guitar;
import Instruments.InstrumentType;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar1;
    Guitar guitar2;
    Flute flute1;
    Sheet sheet1;

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
                InstrumentType.STRING, "Red", "Wood-Plastic", 6);
        flute1 = new Flute("Lovely flute", 22.00, 35.00,
                InstrumentType.WOODWIND, "Bronzey", "Copper", 8);
        shop.addItemToStock(guitar1);
        shop.addItemToStock(flute1);
        assertEquals(2, shop.getStockQty());
    }

    @Test
    public void canRemoveItemFromStock() {
        guitar1 = new Guitar("Lovely sounding strings", 45.00, 75.00,
                InstrumentType.STRING, "Red", "Wood-Plastic", 6);
        guitar2 = new Guitar("Rubbish guitar", 25.00, 26.00,
                InstrumentType.STRING, "Brown", "Plastic", 4);
        shop.addItemToStock(guitar1);
        shop.addItemToStock(guitar2);
        assertEquals(2, shop.getStockQty());
        shop.removeItemFromStock(guitar2);
        assertEquals(1, shop.getStockQty());

    }

    @Test
    public void canCalulateTotalAmountOfProfit() {
        guitar1 = new Guitar("Lovely sounding strings", 45.00, 75.00,
                InstrumentType.STRING, "Red", "Wood-Plastic", 6);
        guitar2 = new Guitar("Rubbish guitar", 25.00, 26.00,
                InstrumentType.STRING, "Brown", "Plastic", 4);
        flute1 = new Flute("Lovely flute", 22.00, 35.00,
                InstrumentType.WOODWIND, "Bronzey", "Copper", 8);
        sheet1 = new Sheet("Sheet Music for Guitar Beginners", 1.50,
                3.50, "Written things");
        shop.addItemToStock(guitar1);
        shop.addItemToStock(guitar2);
        shop.addItemToStock(flute1);
        shop.addItemToStock(sheet1);
        assertEquals(46.00, shop.canCalulateTotalAmountOfProfit(), 0.01);
    }
}
