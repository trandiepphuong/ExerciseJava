import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrEx6Test {

    @Test
    public void test_findMaxLenght() {
        assertEquals(new ArrEx6().findMaxLenght(new int[] {5, 4, 2, 10, 1, 2, 3, 4, 89, 15, 16, 17, 18, 19, 20}), "15, 16, 17, 18, 19, 20");
    }
}
