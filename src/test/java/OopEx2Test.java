import org.junit.jupiter.api.Test;
import java.util.Stack;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class OopEx2Test {
    @Test
    public void test_stack() {
        Stack s = new Stack();
        new OopEx2().stack_push(s,1);
        new OopEx2().stack_push(s,2);
        new OopEx2().stack_push(s,3);
        assertEquals(new OopEx2().display(s), "[1, 2, 3]");
        assertEquals(new OopEx2().stack_peek(s), 3);
        assertEquals(new OopEx2().stack_search(s,3), 1);
        assertEquals(new OopEx2().stack_pop(s), 3);
        assertEquals(new OopEx2().display(s), "[1, 2]");
    }
}