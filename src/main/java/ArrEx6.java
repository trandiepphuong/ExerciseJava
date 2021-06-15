import java.util.ArrayList;
import java.util.List;

public class ArrEx6 {
    public String findMaxLenght(int[] arr) {
        List<String> result = new ArrayList<>();
        int n = arr.length;
        int length = 1;
        int max = 1;
        int start = 0;
        int end = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                length++;
                if (length > max) {
                    max = length;
                    start = i + 2 - length;
                    end = i + 2;
                }
            } else
                length = 1;
        }
        for (int i = start; i < end; i++)
            result.add(String.valueOf(arr[i]));
        return String.join(", ",result);
    }

//    public static void main(String[] args) {
//        int[] a = new int[]{5, 4, 2, 10, 1, 2, 3, 4, 89, 15, 16, 17, 18};
//        findMaxLenght(a);
//    }
}

