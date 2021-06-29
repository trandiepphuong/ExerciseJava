import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrEx3Test {
    @Test
    public void test_maxInt() {
        assertEquals(new StrEx3().sumInt("abc 123 def 33 mn 3.221"), 380);
    }
}
