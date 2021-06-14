import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrEx1Test {

    @Test
    public void test_twiceInArr() {
        assertEquals(new ArrEx1().twiceInArr(new int[]{1, 2, 3, 4, 5}), "");
        assertEquals(new ArrEx1().twiceInArr(new int[]{1, 1, 3, 4, 5}), "1");
        assertEquals(new ArrEx1().twiceInArr(new int[]{1, 1, 2, 2, 3}), "1, 2");
    }
}
