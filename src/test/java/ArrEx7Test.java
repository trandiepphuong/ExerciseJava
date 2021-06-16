import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrEx7Test {

    @Test
    public void test_sub() {
        assertEquals(new ArrEx7().sub(new int[]{1, 2, 3, 4, 5}), 4);
        assertEquals(new ArrEx7().sub(new int[]{1, 2, 3, 4, 5, -6}), 11);
    }
}
