import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrEx7Test {
    @Test
    public void test_dich() {
        assertEquals(new StrEx7().dich("ab13c"), "abbbbbbbbbbbbbc");
        assertEquals(new StrEx7().dich("a12b23c3"), "a".repeat(12) + "b".repeat(23) + "c".repeat(3));
        assertEquals(new StrEx7().dich("a234b23c33"), "a".repeat(234) + "b".repeat(23) + "c".repeat(33));
        assertEquals(new StrEx7().dich("abc4e6fd"), "abcccceeeeeefd");
    }
}
