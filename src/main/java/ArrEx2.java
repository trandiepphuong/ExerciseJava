import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrEx2 {
    public int sum3Max(int[] a) {
        int sum = 0;
        Arrays.sort(a);
        return a[a.length - 1] + a[a.length - 2] + a[a.length - 3];
    }
}
