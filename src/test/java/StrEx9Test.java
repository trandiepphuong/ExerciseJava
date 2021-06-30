import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrEx9Test {
    @Test
    public void test_verifyBarcode() {
        assertEquals(new StrEx9().verifyBarcode("893850597419"), 4);
        assertEquals(new StrEx9().verifyBarcode("497756400041"), 7);
    }
}
