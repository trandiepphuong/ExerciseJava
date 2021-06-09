import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex1Test {

    @Test
    public void test_ucln(){
        Ex1 ex1 = new Ex1();
        assertEquals(ex1.LCM(200, 100), 100);
        assertEquals(ex1.LCM(2, 8), 2);
        assertEquals(ex1.LCM(3, 5), 1);
        assertEquals(ex1.GCD(3, 5), 15);
        assertEquals(ex1.GCD(10, 20), 20);
    }
}
