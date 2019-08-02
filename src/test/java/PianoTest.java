import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setup() {
        piano = new Piano("Classical", 88, "Deep brown", "Oak");
    }

    @Test
    public void canGetType() {
        assertEquals("Classical", piano.getType());
    }

    @Test
    public void canGetKeys() {
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void canGetColour() {
        assertEquals("Deep brown", piano.getColour());
    }
}
