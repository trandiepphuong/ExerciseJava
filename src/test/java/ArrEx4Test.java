import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrEx4Test {

    @Test
    public void test_sortOddEven() {
        assertEquals(new ArrEx4().sortOddEven(new Integer[]{-4, -2, 0, -4, 1, 20, 3, 4, 5, 6, 7, 8, 9, 11}), "[-4, -4, -2, 0, 4, 6, 8, 20, 11, 9, 7, 5, 3, 1]");
        assertEquals(new ArrEx4().sortOddEven(new Integer[]{2, 4, 6}), "[-4, -4, -2, 0, 4, 6, 8, 20, 11, 9, 7, 5, 3, 1]");

    }
}
