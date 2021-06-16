import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrEx15Test {

    @Test
    public void test_twiceInArr() {
        assertEquals(new ArrEx15().findMax(new int[]{1, 8, 3, 7, 5}, 3), "5, 7, 8");
        assertEquals(new ArrEx15().findMax(new int[]{-5, 9, 1000, 8, 5}, 2), "9, 1000");
    }
}
