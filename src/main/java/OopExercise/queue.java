package OopExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class queue {
    //stack giống chồng sách, còn queue giống nguoi xếp hàng
    private Object[] queue;
    private int maxSize;
    private int size = 0;

    //default len 11
    public queue() {
        this(11);
    }

    public queue(int len) {
        maxSize = len;
        queue = new Object[len];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull()      //  Determine if the queue is full. Returns a true value if it is full, otherwise returns a false value.
    {
        return (size >= maxSize);
    }

    //add() - Chèn phần tử đã chỉ định vào hàng đợi. Nếu tác vụ thành công, add() trả ve true, nếu không nó sẽ nem ra một ngoại lệ.
    public boolean add(Object o) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("It's full");
        }
        size++;
        queue[size - 1] = o;
        return true;
    }

    //offer() - Chèn phần tử đã chỉ định vào hàng đợi. Nếu tác vụ thành công, offer() trả ve true, nếu không nó sẽ trả ve false.
    public boolean offer(Object o) {
        if (isFull()) {
            return false;
        }
        size++;
        queue[size - 1] = o;
        return queue[size - 1] == o;
    }

    //peek() - Trả ve đầu của hàng đợi. Trả ve null nếu hàng đợi trống.
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return queue[0];
    }

    //element() - Trả ve phần đầu của hàng đợi. Ném một ngoại lệ nếu hàng đợi trống.
    public Object element() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Cannot be empty");
        }
        return queue[0];
    }

    // poll() - Trả về và loại bỏ phần đầu của hàng đợi. Trả về null nếu hàng đợi trống.
    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        int temp = size;
        size = size - 1;
        Object o = queue[0];
        int n = temp - 1;
        Object[] newQueue = new Object[n];
        System.arraycopy(queue, 1, newQueue, 0, n);
        queue = newQueue;
        return o;
    }

    //remove() - Trả về và xóa phần đầu của hàng đợi. Ném một ngoại lệ nếu hàng đợi trống.
    public Object remove() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Cannot be empty");
        }
        int temp = size;
        size = size - 1;
        Object o = queue[0];
        int n = temp - 1;
        Object[] newQueue = new Object[n];
        System.arraycopy(queue, 1, newQueue, 0, n);
        queue = newQueue;
        return o;
    }

    @Override
    public String toString() {
        List<Object> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(queue[i]);
        }
        return String.join(", ", result.toString());
    }
}
