import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class OopEx4 {
    public void addPerson(Stack<Person> s, Person p) {
        s.push(p);
    }

    public String firstPerson(Stack<Person> s) {
        return s.peek().getName();
    }

    public String deleteFirst(Stack<Person> s) {
        return s.pop().getName();
    }

    public int searchPerson(Stack<Person> s, Person p) {
        return s.search(p);
    }

    public String display(Stack<Person> s) {
        List<String> result = new ArrayList<>();
        for (Person p : s) {
            result.add(p.getName());
        }
        return String.join(", ", result);
    }
}
