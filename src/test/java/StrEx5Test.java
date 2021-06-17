import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrEx5Test {
    @Test
    public void test_appearMore2Time() {
        assertEquals(new StrEx5().appearMore2Time("cho meo cho cho cho meo chuot"), "cho, meo") ;
        assertEquals(new StrEx5().appearMore2Time("cho meo cho cho cho chuot"), "cho") ;
    }
}