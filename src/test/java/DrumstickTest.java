import Accessories.Drumstick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumstickTest {

    Drumstick drumstick;

    @Before
    public void setup() {
        drumstick = new Drumstick("Classical drumstick", 1.20, 4.20, "Bangy things");
    }

    @Test
    public void canGetDescription() {
        assertEquals("Classical drumstick", drumstick.getDescription());
    }

    @Test
    public void canGetBuyFor() {
        assertEquals(1.20, drumstick.getBuyFor(), 0.01);
    }

    @Test
    public void canGetSellFor() {
        assertEquals(4.20, drumstick.getSellFor(), 0.01);
    }

    @Test
    public void canGetCategory() {
        assertEquals("Bangy things", drumstick.getCategory());
    }

    @Test
    public void canCalulateMarkup() {
        assertEquals(3.00, drumstick.calculateMarkup(), 0.01);
    }
}

