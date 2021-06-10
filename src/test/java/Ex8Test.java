import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex8Test {

    @Test
    public void test_pi(){
        assertEquals(String.format("%.3f", new Ex8().pi()), "3.141");
    }
}
