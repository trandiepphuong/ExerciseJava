import java.util.Queue;

public class OopEx3 {

    public void addElement(Queue<Integer> q, int e) {
        q.offer(e);
    }

    public int firstElement(Queue<Integer> q) {
        return q.peek();
    }

    public int deleteFirstEle(Queue<Integer> q) {
        // poll(): Lấy ra và loại bo phần tử đầu tiên ra khoi hàng đợi.
        // Trả ve null nếu không còn phần tử nào trong hàng đợi.
        return q.poll();
    }

    public String displayQueue(Queue<Integer> q) {
        return q.toString();
    }
}
