import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public String phantichNT(int n) {
        List<String> result = new ArrayList<>();
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                result.add(String.valueOf(i));
            } else {
                i++;
            }
        }
        return String.join("*",result);
    }
}
