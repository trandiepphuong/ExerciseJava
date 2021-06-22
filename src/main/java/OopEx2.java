import java.util.Stack;
public class OopEx2 {
    //Push bổ sung một phan tử vào dinh (top) của ngan xếp, nghia là sau các
    //phan tử đã có trong ngan xếp. Pop giai phong và tra ve phan tu dang
    //dung o dinh cua ngan xep.
    public void stack_push(Stack<Integer> stack, int i) {
        stack.push(i);
    }
    public int stack_pop(Stack<Integer> stack) {
        return stack.pop();
    }
    // Displaying element on the top of the stack
    public int stack_peek(Stack<Integer> stack) {
        return stack.peek();
    }
    public int stack_search(Stack<Integer> stack, int element) {
        return stack.search(element);
    }
    public String display(Stack<Integer> stack){
        return stack.toString();
    }
}