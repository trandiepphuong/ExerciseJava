import java.util.*;

public class Ex14 {
    public int demSoChuSo(int n) {
        int m = 0;
        while (n > 0) {
            n = n / 10;
            m++;
        }
        return m;
    }

    public boolean checkArmstrong(int n) {
        int sum = 0;
        int m = demSoChuSo(n);
        int p = n;
        int q = n;

        for (int i = 1; i <= m; i++) {
            int z = p % 10;
            sum += Math.pow(z, m);
            p /= 10;
        }
        if (sum == q)
            return true;
        else
            return false;
    }

    public String listArmstrong() {
        String result = "";
        for (int i = 10; i <= 99999; i++) {
            if (checkArmstrong(i)) {
                result = String.join(",", result, String.valueOf(i));
            }
        }
        return result.substring(1, result.length());
    }
}
