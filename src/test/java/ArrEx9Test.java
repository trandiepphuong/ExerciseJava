import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrEx9Test {

    @Test
    public void test_binarySearch() {
        assertEquals(new ArrEx9().binarySearch(new int[]{1, 2, 3, 4, 5}, 5), 4);
        assertEquals(new ArrEx9().binarySearch(new int[]{1, 2, 3, 4, 5}, 2), 1);
        assertEquals(new ArrEx9().binarySearch(new int[]{1, 2, 3, 4, 5}, 6), -1);

    }
}
