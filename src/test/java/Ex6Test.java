import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex6Test {

    @Test
    public void test_tinh(){
        assertEquals(new Ex6().tinh(-5), 0);
        assertEquals(new Ex6().tinh(0), 0);
        assertEquals(new Ex6().tinh(1), 2);
        assertEquals(new Ex6().tinh(5), 70);
    }
}
