import Accessories.Sheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetTest {

    Sheet sheet;

    @Before
    public void setup() {
        sheet = new Sheet("Sheet Music for Guitar Beginners", 1.50, 3.50);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Sheet Music for Guitar Beginners", sheet.getDescription());
    }

    @Test
    public void canGetBuyFor() {
        assertEquals(1.50, sheet.getBuyFor(), 0.01);
    }

    @Test
    public void canGetSellFor() {
        assertEquals(3.50, sheet.getSellFor(), 0.01);
    }
}
