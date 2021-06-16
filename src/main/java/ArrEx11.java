import java.util.ArrayList;
import java.util.List;

public class ArrEx11 {
    public int subMaxSum(int[] a) {
        int n = a.length;
        int dau = 0, cuoi = 0, sum = 0, max = a[0];
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum > max) {
                max = sum;
                cuoi = i;
            }
            if (sum < 0) {
                dau = i + 1;
                sum = 0;
            }
        }
        return sum;
    }
}