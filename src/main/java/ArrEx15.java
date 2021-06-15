import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrEx15 {
    public String findMax(int[] a, int k) {
        List<String> result = new ArrayList<>();
        Arrays.sort(a);
        for (int i = a.length - k; i < a.length; i++) {
            result.add(String.valueOf(a[i]));
        }
        return String.join(", ", result);
    }
}
