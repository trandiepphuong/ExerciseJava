package OopExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack {
    private Object[] stack;

    private int size = 0;

    //mac dinh len = 10
    public Stack() {
        this(10);
    }

    public Stack(int len) {
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
    public void push(Object element) {
        size++;
        if (size >= stack.length) {
            stack = Arrays.copyOf(stack, size * 2);
        }
        stack[size - 1] = element;
    }

    //xoa phan tu tren dinh va tra ve phan tu vua xoa
    public Object pop() {
        Object element = stack[--size];
        stack[size] = null;
        return element;
    }
}