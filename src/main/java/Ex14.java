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
        int digits = demSoChuSo(n);
        int p = n;

        for (int i = 1; i <= digits; i++) {
            int z = p % 10;
            sum += Math.pow(z, digits);
            p /= 10;
        }
        if (sum == n)
            return (sum == n);
        return false;
    }

    public String listArmstrong() {
        ArrayList result = new ArrayList<String>();
        for (int i = 10; i <= 99999; i++) {
            if (checkArmstrong(i)) {
                result.add(String.valueOf(i));
            }
        }
        return String.join(", ", result);
    }
}
