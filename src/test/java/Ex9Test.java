import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex9Test {
    @Test
    public void test_pi() {
        assertEquals(new Ex9().pi(), 3.14159, Ex9.E);
    }
}
