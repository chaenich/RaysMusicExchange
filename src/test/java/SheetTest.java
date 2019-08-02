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
}
