import Instruments.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void setup() {
        flute = new Flute("Picoloe", "Bronzey", "Copper",8);
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
    public void canGetValves() {
        assertEquals(8, flute.getValves());
    }

    @Test
    public void canPlay() {
        assertEquals("Peep Peep", flute.play());
    }

}
