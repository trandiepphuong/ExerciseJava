import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex17Test {

    @Test
    public void test() {
        assertEquals(new Ex17().squareRoot(4), 2, Ex17.epsilon);
        assertEquals(new Ex17().squareRoot(0), 0, Ex17.epsilon);
        assertEquals(new Ex17().squareRoot(1), 1, Ex17.epsilon);
        assertEquals(new Ex17().squareRoot(5), 2.236, Ex17.epsilon);
    }
}
