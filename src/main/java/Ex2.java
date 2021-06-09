public class Ex2 {
    public int sum(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n = n / 10;
        }
        return s;
    }
}
