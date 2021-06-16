import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrEx11Test {

    @Test
    public void test_subMaxSum() {
        assertEquals(new ArrEx11().subMaxSum(new int[]{0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1}), 23);
    }
}
