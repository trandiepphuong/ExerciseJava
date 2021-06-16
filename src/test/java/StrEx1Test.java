import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrEx1Test {
    @Test
    public void test_split() {
        assertEquals(new StrEx1().split("a.b!c?d\ne"), "a, b, c, d, e");
    }
}
