import Instruments.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void setup() {
        flute = new Flute("Lovely flute", 22.00, 35.00,
                "Picoloe", "Bronzey", "Copper",8);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Lovely flute", flute.getDescription());
    }

    @Test
    public void canGetBuyFor() {
        assertEquals(22.00, flute.getBuyFor(), 0.01);
    }

    @Test
    public void canGetSellFor() {
        assertEquals(35.00, flute.getSellFor(), 0.01);
    }
    @Test
    public void canGetType() {
        assertEquals("Picoloe", flute.getType());
    }

    @Test
    public void  canGetColour() {
        assertEquals("Bronzey", flute.getColour());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Copper", flute.getMaterial());
    }

    @Test
    public void canGetNumValves() {
        assertEquals(8, flute.getNumValves());
    }

    @Test
    public void canPlay() {
        assertEquals("Peep Peep", flute.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(13.00, flute.calculateMarkup(), 0.01);
    }
}
