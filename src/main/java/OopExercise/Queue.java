package OopExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queue {
    //stack giống chồng sách, còn queue giống nguoi xếp hàng
    private ArrayList<Object> queue = new ArrayList<>();

    public boolean isEmpty() {
        return queue.size() == 0;
    }


    //add() - Chèn phần tử đã chỉ định vào hàng đợi. Nếu tác vụ thành công, add() trả ve true, nếu không nó sẽ nem ra một ngoại lệ.
    public boolean enqueue(Object element) {
        queue.add(element);
        return true;
    }

    //peek() - Trả ve đầu của hàng đợi. Trả ve null nếu hàng đợi trống.
    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("It's full");
        }
        return queue.get(0);
    }


    public ArrayList<Object> getQueue() {
        return queue;
    }

    // poll() - Trả về và loại bỏ phần đầu của hàng đợi. Trả về null nếu hàng đợi trống.
    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("It's full");
        }
        Object element = queue.get(0);
        queue.remove(0);
        return element;
    }
}
