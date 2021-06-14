import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public String phantichNT(int n) {
        String result = "";
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                result += i;
            } else {
                i++;
            }
        }
        return result;
    }
}
