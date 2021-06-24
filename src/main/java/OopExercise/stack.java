package OopExercise;

import java.util.ArrayList;
import java.util.List;

public class stack {
    private Object[] stack;

    private int size = 0;

    //mac dinh len = 10
    public stack() {
        this(10);
    }

    public stack(int len) {
        stack = new Object[len];
    }

    //peek tra ve phan tu tren dinh
    public Object peek() {
        return stack[size - 1];
    }

    public int size() {
        return size;
    }

    //them phan tu vao dinh, nghia là sau các phan tử đã có trong ngan xếp
    public void push(Object o) {
        size++;
        if (size == stack.length) {
            Object[] newStack = new Object[size];
            System.arraycopy(stack, 0, newStack, 0, size);
            stack = newStack;
        }
        stack[size - 1] = o;
    }

    //xoa phan tu tren dinh va tra ve phan tu vua xoa
    public Object pop() {
        size = size - 1;
        Object o = stack[size];
        stack[size] = null;
        return o;
    }

    //tim kiem va tra ve vi tri phan tu trong stack
    public int search(Object o) {
        int j = 1;
        for (int i = size - 1; i >= 0; i--) {
            if (stack[i] == o) {
                return j;
            }
            j++;
        }
        return -1;
    }

    @Override
    public String toString() {
        List<Object> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(stack[i]);
        }
        return String.join(", ", result.toString());
    }
}