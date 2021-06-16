import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex3Test {

    @Test
    public void test_phantichNT(){
        assertEquals(new Ex3().phantichNT(1), "");
        assertEquals(new Ex3().phantichNT(600), "2*2*2*3*5*5");
        assertEquals(new Ex3().phantichNT(6), "2*3");
    }
}
