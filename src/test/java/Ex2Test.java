import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex2Test {

    @Test
    public void test(){
        Ex2 ex2 = new Ex2();
        assertEquals(ex2.sum(1), 1);
        assertEquals(ex2.sum(100), 1);
        assertEquals(ex2.sum(0), 0);
        assertEquals(ex2.sum(123456789), 45);
    }
}
