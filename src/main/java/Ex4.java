public class Ex4 {
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public String printFibonacci(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += fibonacci(i);
        }
        return result;
    }
}
