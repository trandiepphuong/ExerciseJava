import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex10Test {

    @Test
    public void test_thu(){
        assertEquals(new Ex10().thu(10,6,2021), "thu nam");
        assertEquals(new Ex10().thu(11,6,2021), "thu sau");
    }
}
