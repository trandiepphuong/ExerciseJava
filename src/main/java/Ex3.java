import java.util.ArrayList;
import java.util.List;
public class Ex3 {
    public static String PTTSNT(int n){
        String s = "";
        int i = 2;
        List<Integer> listNumbers = new ArrayList<Integer>();
        // phân tích
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                s+=i;
            } else {
                i++;
            }
        }
        return s;
    }
}
