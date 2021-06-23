import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OopEx3Test {
    @Test
    public void test_ucln(){
        Queue<Integer> q = new LinkedList<>();
        new OopEx3().addElement(q,1);
        new OopEx3().addElement(q,2);
        new OopEx3().addElement(q,3);
        assertEquals(new OopEx3().firstElement(q), 1);
        assertEquals(new OopEx3().deleteFirstEle(q), 1);
        assertEquals(new OopEx3().displayQueue(q), "[2, 3]");
    }
}
