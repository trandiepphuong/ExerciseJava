import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrEx6Test {

    @Test
    public void test_rutgon() {
        assertEquals(new StrEx6().rutgon("abcccceeeeeefd"), "abc4e6fd");
        assertEquals(new StrEx6().rutgon("abbbbbbbbbbbbbc"), "ab13c");
    }
}
