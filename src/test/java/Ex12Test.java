import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex12Test {

    @Test
    public void test_canbac2() {
        assertEquals(new Ex12().canbac2(4), 2, new Ex12().PRECISE);
        assertEquals(new Ex12().canbac2(1), 1, new Ex12().PRECISE);
        assertEquals(new Ex12().canbac2(5), 2.236, new Ex12().PRECISE);
    }
}
