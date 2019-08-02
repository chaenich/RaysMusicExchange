import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup() {
        guitar = new Guitar("Electric", 6, "Red", "Wood-Plastic");
    }

    @Test
    public void canGetType() {
         assertEquals("Electric", guitar.getType());
    }

    @Test
    public void canGetStrings() {
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void  canGetColour() {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood-Plastic", guitar.getMaterial());
    }
    @Test
    public void canPlay() {
        assertEquals("Strum Strum", guitar.play());
    }

}
