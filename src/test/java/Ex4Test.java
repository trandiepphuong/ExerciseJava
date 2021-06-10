import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex4Test {

    @Test
    public void test(){
        assertEquals(new Ex4().printFibonacci(1), "0");
        assertEquals(new Ex4().printFibonacci(0), "");
        assertEquals(new Ex4().printFibonacci(2), "01");
        assertEquals(new Ex4().printFibonacci(6), "011235");
    }
}
