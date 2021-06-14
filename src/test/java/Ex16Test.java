import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex16Test {

    @Test
    public void test_demFibo() {
        assertEquals(new Ex16().demFibo(1), 1);
        assertEquals(new Ex16().demFibo(10), 7);
        assertEquals(new Ex16().demFibo(13), 8);
        assertEquals(new Ex16().demFibo(100), 12);
    }
}
