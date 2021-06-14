import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrEx5Test {

    @Test
    public void test_sum() {
        assertEquals(new ArrEx5().sum(new int[]{1, 2, 3, 4, 5}), 15);
    }
}
