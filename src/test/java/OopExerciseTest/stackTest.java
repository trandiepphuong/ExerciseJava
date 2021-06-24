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
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        assertEquals(s.toString(), "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        assertEquals(s.peek(), 10);
        assertEquals(s.size(), 10);
        assertEquals(s.search(10), 1);
        assertEquals(s.search(1), 10);
        assertEquals(s.search(0), -1);
        assertEquals(s.pop(), 10);
        assertEquals(s.toString(), "[1, 2, 3, 4, 5, 6, 7, 8, 9]");
    }
}