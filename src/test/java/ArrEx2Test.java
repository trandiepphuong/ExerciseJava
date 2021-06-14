import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrEx2Test {

    @Test
    public void test_sum3Max(){
        assertEquals(new ArrEx2().sum3Max(new int[] {1,2,3,4,5}), 12);
        assertEquals(new ArrEx2().sum3Max(new int[] {0,0,0,0,0}), 0);
        assertEquals(new ArrEx2().sum3Max(new int[] {1,2,3,4,4}), 11);

    }
}
