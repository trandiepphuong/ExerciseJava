import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex3Test {

    @Test
    public void test_phantichNT(){
        assertEquals(new Ex3().phantichNT(1), "");
        assertEquals(new Ex3().phantichNT(600), "222355");
        assertEquals(new Ex3().phantichNT(6), "23");
    }
}
