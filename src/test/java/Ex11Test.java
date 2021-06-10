import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex11Test {

    @Test
    public void test_thang() {
        assertEquals(new Ex11().thang(1), "thang mot");
        assertEquals(new Ex11().thang(2), "thang hai");
        assertEquals(new Ex11().thang(3), "thang ba");
        assertEquals(new Ex11().thang(4), "thang tu");
        assertEquals(new Ex11().thang(5), "thang nam");
        assertEquals(new Ex11().thang(6), "thang sau");
        assertEquals(new Ex11().thang(7), "thang bay");
        assertEquals(new Ex11().thang(8), "thang tam");
        assertEquals(new Ex11().thang(9), "thang chin");
        assertEquals(new Ex11().thang(10), "thang muoi");
        assertEquals(new Ex11().thang(11), "thang muoi mot");
        assertEquals(new Ex11().thang(12), "thang muoi hai");
    }
}
