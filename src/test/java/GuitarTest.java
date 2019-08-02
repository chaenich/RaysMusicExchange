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

}
