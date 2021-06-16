import java.util.*;

public class Ex14 {
    public int demSoChuSo(int n) {
        return n < 10 ? 1 : 1 + demSoChuSo(n / 10);
    }

    public boolean checkArmstrong(int n) {
        int sum = 0;
        int digits = demSoChuSo(n);
        int p = n;

        for (int i = 1; i <= digits; i++) {
            sum += Math.pow(p % 10, digits);
            p /= 10;
        }
        return (sum == n);
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
