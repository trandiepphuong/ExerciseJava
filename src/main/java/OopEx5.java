import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class OopEx5 {
    public void addPerson(Queue<Person> q, Person p) {
        q.offer(p);
    }

    public String firstPerson(Queue<Person> q) {
        return q.peek().getName();
    }

    public String deleteFirstPerson(Queue<Person> q) {
        return q.poll().getName();
    }

    public String display(Queue<Person> q) {
        List<String> result = new ArrayList<>();
        for (Person p : q) {
            result.add(p.getName());
        }
        return String.join(", ", result);
    }
}
