import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex2Test {

    @Test
    public void test() {
        assertEquals(new Ex2().sum(1), 1);
        assertEquals(new Ex2().sum(100), 1);
        assertEquals(new Ex2().sum(0), 0);
        assertEquals(new Ex2().sum(123456789), 45);
    }
}
