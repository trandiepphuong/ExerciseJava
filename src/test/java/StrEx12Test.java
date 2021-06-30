import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrEx12Test {
    @Test
    public void testMax() {
        assertEquals(new StrEx12().max(new int[]{48, 7, 134}), "748134");
        assertEquals(new StrEx12().max(new int[]{9, 20, 3, 2}), "93220");
        assertEquals(new StrEx12().max(new int[]{10, 2}), "210");
        assertEquals(new StrEx12().max(new int[]{46, 461}), "46461");
    }
}
