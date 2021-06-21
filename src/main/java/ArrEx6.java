import java.util.ArrayList;
import java.util.List;

public class ArrEx6 {
    public String findMaxLenght(int[] arr) {
        int n = arr.length;
        int maxLength = 1;
        int max = 1;
        int start = 0;
        int end = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                maxLength++;
                if (maxLength > max) {
                    max = maxLength;
                    start = i + 2 - maxLength;
                    end = i + 2;
                }
            } else {
                maxLength = 1;
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = start; i < end; i++)
            result.add(String.valueOf(arr[i]));
        return String.join(", ", result);
    }
}

