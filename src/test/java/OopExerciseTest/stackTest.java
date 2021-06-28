package OopExerciseTest;

import OopExercise.Stack;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class stackTest {
    static Stack s = new Stack();
    @BeforeAll
    static void init() {
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
        s.push(11);
    }

    @Test
    public void test_peek() {
        assertEquals(s.peek(), 11);
    }

    @Test
    public void test_size() {
        assertEquals(s.size(), 11);
    }

    @Test
    public void test_pop() {
        assertEquals(s.pop(), 11);
    }
}
