import Instruments.Instrument;
import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setup() {
        piano = new Piano("Looks great in the corner",500.00,650.00,
                InstrumentType.KEYBOARD,"Deep brown", "Oak", 88);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Looks great in the corner", piano.getDescription());
    }

    @Test
    public void canGetBuyFor() {
        assertEquals(500.00, piano.getBuyFor(), 0.01);
    }

    @Test
    public void canGetSellFor() {
        assertEquals(650.00, piano.getSellFor(), 0.01);
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Deep brown", piano.getColour());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Oak", piano.getMaterial());
    }

    @Test
    public void canGetNumKeys() {
        assertEquals(88, piano.getNumKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Plink Plink", piano.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(150.00, piano.calculateMarkup(), 0.01);
    }



}
