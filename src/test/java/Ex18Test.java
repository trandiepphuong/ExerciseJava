import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex18Test {

    @Test
    public void test() {
        assertEquals(new Ex18().covertToDecimal("VIM"), 1004);
        assertEquals(new Ex18().covertToDecimal("XXXII"), 32);
        assertEquals(new Ex18().covertToDecimal("XLV"), 45);
        assertEquals(new Ex18().covertToDecimal("MMMDCCCLXXXVIII"), 3888);
        assertEquals(new Ex18().covertToDecimal("MMMCMXCIX "), 3999);
        assertEquals(new Ex18().covertToDecimal("I"), 1);
        assertEquals(new Ex18().covertToDecimal("II"), 2);
        assertEquals(new Ex18().covertToDecimal("IV"), 4);
        assertEquals(new Ex18().covertToDecimal("VI"), 6);

    }
}
