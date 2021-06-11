import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex11Test {

    @Test
    public void test_thang() {
        assertEquals(new Ex11().thang(1), "thang 1");
        assertEquals(new Ex11().thang(2), "thang 2");
        assertEquals(new Ex11().thang(3), "thang 3");
        assertEquals(new Ex11().thang(4), "thang 4");
        assertEquals(new Ex11().thang(5), "thang 5");
        assertEquals(new Ex11().thang(6), "thang 6");
        assertEquals(new Ex11().thang(7), "thang 7");
        assertEquals(new Ex11().thang(8), "thang 8");
        assertEquals(new Ex11().thang(9), "thang 9");
        assertEquals(new Ex11().thang(10), "thang 10");
        assertEquals(new Ex11().thang(11), "thang 11");
        assertEquals(new Ex11().thang(12), "thang 12");
    }
}
