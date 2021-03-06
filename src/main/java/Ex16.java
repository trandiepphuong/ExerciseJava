import java.util.ArrayList;
import java.util.List;

public class Ex16 {
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    public int demFibo(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (fibonacci(i) > n) {
                break;
            } else count++;
        }
        return count;
    }
}
