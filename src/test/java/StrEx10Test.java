import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrEx10Test {
    @Test
    public void test_sum() {
        assertEquals(new StrEx10().sum("12","20000"), "20012");
        assertEquals(new StrEx10().sum("10000","1"), "10001");
        assertEquals(new StrEx10().sum("999","999"), "1998");

    }
}
