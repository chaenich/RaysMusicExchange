import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup() {
        guitar = new Guitar("Lovely sounding strings", 45.00, 75.00,
                InstrumentType.STRING, "Red", "Wood-Plastic", 6);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Lovely sounding strings", guitar.getDescription());
    }

    @Test
    public void canGetBuyFor() {
        assertEquals(45.00, guitar.getBuyFor(), 0.01);
    }

    @Test
    public void canGetSellFor() {
        assertEquals(75.00, guitar.getSellFor(), 0.01);
    }

    @Test
    public void canGetType() {
         assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood-Plastic", guitar.getMaterial());
    }

    @Test
    public void canGetNumStrings() {
        assertEquals(6, guitar.getNumStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum Strum", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(30.00, guitar.calculateMarkup(), 0.01);
    }

}
