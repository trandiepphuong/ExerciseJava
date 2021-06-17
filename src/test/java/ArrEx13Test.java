import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrEx13Test {

    @Test
    public void test_delRowCol() {
        assertEquals(new ArrEx13().delRowCol((new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }), 0, 0), "[[5, 6], [8, 9]]");
    }
}
