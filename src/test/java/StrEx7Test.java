import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrEx7Test {
    @Test
    public void test_dich() {
        assertEquals(new StrEx7().dich("ab13c"), "abbbbbbbbbbbbbc");
        assertEquals(new StrEx7().dich("abc4e6fd"), "abcccceeeeeefd");
    }
}
