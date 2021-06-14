import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex7Test {

    @Test
    public void test_giaithua(){
        assertEquals(new Ex7().giaithua(0), 1);
        assertEquals(new Ex7().giaithua(1), 1);
        assertEquals(new Ex7().giaithua(3), 6);
    }
}
