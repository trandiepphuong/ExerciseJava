import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex10Test {

    @Test
    public void test_thu() {
        assertEquals(new Ex10().thu(1, 2, 2021), "thu 2");
        assertEquals(new Ex10().thu(6, 6, 2021), "chu nhat");
        assertEquals(new Ex10().thu(8, 6, 2021), "thu 3");
        assertEquals(new Ex10().thu(9, 6, 2021), "thu 4");
        assertEquals(new Ex10().thu(10, 6, 2021), "thu 5");
        assertEquals(new Ex10().thu(11, 6, 2021), "thu 6");
        assertEquals(new Ex10().thu(12, 6, 2021), "thu 7");
    }
}
