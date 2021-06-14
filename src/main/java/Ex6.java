public class Ex6 {
    public int tinh(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (i + 1);
        }
        return sum;
    }
}
