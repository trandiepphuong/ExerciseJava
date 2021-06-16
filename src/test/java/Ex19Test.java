import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex19Test {

    @Test
    public void test() {
        assertEquals(new Ex19().covertToRoman(1004), "MIV");
        assertEquals(new Ex19().covertToRoman(32), "XXXII");
        assertEquals(new Ex19().covertToRoman(45), "XLV");
        assertEquals(new Ex19().covertToRoman(3888), "MMMDCCCLXXXVIII");
        assertEquals(new Ex19().covertToRoman(3999), "MMMCMXCIX");
    }
}
