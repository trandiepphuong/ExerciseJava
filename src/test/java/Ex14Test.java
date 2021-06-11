import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex14Test {

    @Test
    public void test_armstrong() {
        assertEquals(new Ex14().listArmstrong(), "153,370,371,407,1634,8208,9474,54748,92727,93084");
    }
}
