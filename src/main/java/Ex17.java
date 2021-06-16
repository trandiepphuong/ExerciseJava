public class Ex17 {
    public static final double epsilon = 0.0001;

    public double func(double x, double n) {
        return x * x - n;
    }

    double squareRoot(double n) {
        if (n <= 1) return n;
        double left = 0;
        double right = n;
        while (right - left > epsilon) {
            double middle = (left + right) / 2;
            if (func(middle, n) < 0) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return (left + right) / 2;
    }
}
