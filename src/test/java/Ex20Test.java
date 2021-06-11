import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex20Test {
    @Test
    public void test_checkhanhphuc() {
        assertEquals(new Ex20().checkHanhphuc(19), true);
        assertEquals(new Ex20().checkHanhphuc(44), true);
        assertEquals(new Ex20().checkHanhphuc(986543210), true);
        assertEquals(new Ex20().checkHanhphuc(1503), false);
    }
}
