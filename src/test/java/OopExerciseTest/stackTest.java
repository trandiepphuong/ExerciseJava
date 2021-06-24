package OopExerciseTest;
import OopExercise.stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class stackTest {
    @Test
    public void test_stack() {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals(s.toString(), "[1, 2, 3]");
        assertEquals(s.peek(), 3);
        assertEquals(s.size(), 3);
        assertEquals(s.search(3), 1);
        assertEquals(s.pop(), 3);
        assertEquals(s.toString(), "[1, 2]");
    }
}