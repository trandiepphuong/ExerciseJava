import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OopEx4Test {
    @Test
    public void test_stackPerson() {
        Person p1 = new Person(18, "Phuong");
        Person p2 = new Person(19, "Linh");
        Person p3 = new Person(20, "Triet");
        Stack<Person> s = new Stack<>();
        new OopEx4().addPerson(s, p1);
        new OopEx4().addPerson(s, p2);
        new OopEx4().addPerson(s, p3);
        assertEquals(new OopEx4().display(s), "Phuong, Linh, Triet");
        assertEquals(new OopEx4().firstPerson(s), "Triet");
        assertEquals(new OopEx4().searchPerson(s, p1), 3);
        assertEquals(new OopEx4().deleteFirst(s),"Triet");
        assertEquals(new OopEx4().display(s),"Phuong, Linh");
    }
}
