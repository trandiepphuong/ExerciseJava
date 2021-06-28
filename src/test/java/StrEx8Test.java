import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrEx8Test {
    @Test
    public void test_checkBarcode() {
        assertEquals(new StrEx8().checkBarcode("8938505974194"), true);
        assertEquals(new StrEx8().checkBarcode("1503200012345"), false);
    }
}
