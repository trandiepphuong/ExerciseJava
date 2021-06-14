import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex15Test {

    @Test
    public void test_nhiphannguoc() {
        assertEquals(new Ex15().nhiphannguoc(23), 29);
        assertEquals(new Ex15().nhiphannguoc(20), 5);
        assertEquals(new Ex15().nhiphannguoc(1), 1);
        assertEquals(new Ex15().nhiphannguoc(0), 0);

    }
}
