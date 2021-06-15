import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrEx10Test {

    @Test
    public void test_insert() {
        assertEquals(new ArrEx10().insert(new int[]{1, 2, 4, 5},3), "[1, 2, 3, 4, 5]");
        assertEquals(new ArrEx10().insert(new int[]{1, 2, 4, 5},6), "[1, 2, 4, 5, 6]");
    }
}
