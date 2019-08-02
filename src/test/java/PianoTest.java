import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setup() {
        piano = new Piano("Classical","Deep brown", "Oak", 88);
    }

    @Test
    public void canGetType() {
        assertEquals("Classical", piano.getType());
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
    public void canPlay() {
        assertEquals("Plink Plink", piano.play());
    }

    @Test
    public void canGetKeys() {
        assertEquals(88, piano.getKeys());
    }
}
