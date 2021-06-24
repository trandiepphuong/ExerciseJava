package OopExerciseTest;

import OopExercise.queue;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class queueTest {
    @Test
    public void test_queue() throws Exception {
        queue q = new queue(3);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            q.element();
        });
        assertEquals(q.peek(),null);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            q.remove();
        });
        assertEquals(q.poll(),null);
        q.offer(1);
        q.add(2);
        q.add(3);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            q.add(4);
        });
        assertEquals(q.offer(4),false);
        assertEquals(q.toString(),"[1, 2, 3]");
        assertEquals(q.element(),1);
        assertEquals(q.peek(), 1);
        assertEquals(q.remove(),1);
        assertEquals(q.toString(),"[2, 3]");
        assertEquals(q.poll(),2);
        assertEquals(q.toString(),"[3]");
    }
}
