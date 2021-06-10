import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex10Test {

    @Test
    public void test_thu() {
        assertEquals(new Ex10().thu(1, 2, 2021), "thu hai");
        assertEquals(new Ex10().thu(6, 6, 2021), "chu nhat");
        assertEquals(new Ex10().thu(8, 6, 2021), "thu ba");
        assertEquals(new Ex10().thu(9, 6, 2021), "thu tu");
        assertEquals(new Ex10().thu(10, 6, 2021), "thu nam");
        assertEquals(new Ex10().thu(11, 6, 2021), "thu sau");
        assertEquals(new Ex10().thu(12, 6, 2021), "thu bay");
    }
}
