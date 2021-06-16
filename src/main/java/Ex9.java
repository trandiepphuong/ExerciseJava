public class Ex9 {
    public static final double E = 0.00001;

    public double pi() {
        double sum = 0;
        double e = 1;
        int n = 1;
        while (e > E) {
            e = (double) 4 / ((2 * n) * (2 * n + 1) * (2 * n + 2));
            if (n % 2 != 0) {
                sum += e;
            } else {
                sum -= e;
            }
            n++;
        }
        sum += 3;
        return sum;
    }
}
