import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex12Test {

    @Test
    public void test_tinh(){
        assertEquals(String.format("%.3f", new Ex12().canbac2(4)), "2.000");
        assertEquals(String.format("%.3f", new Ex12().canbac2(1)), "1.000");
        assertEquals(String.format("%.3f", new Ex12().canbac2(5)), "2.236");
    }
}
