public class Ex20 {
    public int tinh(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public boolean checkHanhphuc(int n) {
        while (n >= 10) {
            int finalRs = tinh(n);
            n = finalRs;
        }
        if (n == 1) return true;
        return false;
    }
}
