public class Ex5 {
    public String giaiPTBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                return "VN";
            } else {
                return "x = " + (-c / b);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                double x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                return ("x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                return "x1 = x2 = " + x;
            } else {
                return "VN";
            }
        }
    }
}
