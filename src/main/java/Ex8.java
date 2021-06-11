public class Ex8 {
    public static final double E = 0.0001;

    public double pi() {
        double sum = 0;
        double e = 1; // sai so e = 1/(2n + 1)
        int n = 1;
        while (e >= E) {
            e = (double) 4 / (2 * n - 1);
            if (n % 2 == 0)
                sum = sum - e;
            else
                sum = sum + e;
            n++;
        }
        return sum;
    }
}