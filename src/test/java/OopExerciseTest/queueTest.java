package OopExerciseTest;

import OopExercise.Queue;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class queueTest {
    @Test
    public void test_queue() throws Exception {
        Queue q = new Queue();
        assertThrows(RuntimeException.class, () -> {
            q.peek();
        });
        assertThrows(RuntimeException.class, () -> {
            q.dequeue();
        });
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        assertEquals(Arrays.toString(q.getQueue().toArray()),"[1, 2, 3]");
        assertEquals(q.peek(),1);
        assertEquals(q.dequeue(),1);
        assertEquals(Arrays.toString(q.getQueue().toArray()),"[2, 3]");
    }
}
