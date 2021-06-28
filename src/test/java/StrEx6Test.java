import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrEx6Test {

    @Test
    public void test_rutgon() {
        assertEquals(new StrEx6().rutgon("ab"+"c".repeat(4)+"e".repeat(6)+"fd"), "abc4e6fd");
        assertEquals(new StrEx6().rutgon("a"+"b".repeat(13)+"c"), "ab13c");
    }
}
