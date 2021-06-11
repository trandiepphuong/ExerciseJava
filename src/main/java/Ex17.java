public class Ex17 {
    public static final double epsilon = 0.0001;

    public double func(double x, double n) {
        return x * x - n;
    }

    double squareRoot(double n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        double xL = 0;
        double xR = n;
        while (xR - xL > epsilon) {
            double xM = (xL + xR) / 2;
            if (func(xM, n) < 0)
                xL = xM;
            else
                xR = xM;
        }
        return (xL + xR) / 2;
    }
}
