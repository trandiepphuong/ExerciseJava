public class Ex4 {
    public  int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public  String main(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s+=fibonacci(i);
        }
        return  s;
    }
}
