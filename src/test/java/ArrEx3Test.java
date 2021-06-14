import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrEx3Test {

    @Test
    public void test_ucln() {
        assertEquals(new ArrEx3().oddEven(new int[]{1, 2, 3, 4, 5}), -3);
        assertEquals(new ArrEx3().oddEven(new int[]{0, 2, 3, 4, 5}), -2);
    }
}
