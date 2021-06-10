import java.util.ArrayList;
import java.util.List;

public class Ex16 {
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public int demFibo(int n) {
        List<Integer> listFibo = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (fibonacci(i)>n) break;
            else listFibo.add(fibonacci(i));
        }
        return listFibo.size();
    }
}
