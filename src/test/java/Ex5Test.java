import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex5Test {
    @Test
    public void test_giaiPTBac2() {
        assertEquals(new Ex5().giaiPTBac2(1, -3, 2), "x1 = 2.0, x2 = 1.0");
        assertEquals(new Ex5().giaiPTBac2(1, -4, 4), "x1 = x2 = 2.0");
        assertEquals(new Ex5().giaiPTBac2(1, 1, 2), "VN");
        assertEquals(new Ex5().giaiPTBac2(0, 0, 2), "VN");
        assertEquals(new Ex5().giaiPTBac2(0, -1, 2), "x = 2.0");
    }
}
