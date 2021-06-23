import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OopEx5Test {
    @Test
    public void test_queuePerson() {
        Person p1 = new Person(18, "Phuong");
        Person p2 = new Person(19, "Linh");
        Person p3 = new Person(20, "Triet");
        Queue<Person> q = new LinkedList<>();
        new OopEx5().addPerson(q, p1);
        new OopEx5().addPerson(q, p2);
        new OopEx5().addPerson(q, p3);
        assertEquals(new OopEx5().display(q), "Phuong, Linh, Triet");
        assertEquals(new OopEx5().firstPerson(q), "Phuong");
        assertEquals(new OopEx5().deleteFirstPerson(q), "Phuong");
        assertEquals(new OopEx5().display(q), "Linh, Triet");
    }
}
