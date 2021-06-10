public class Ex8 {
    double E = 0.0001;
    public double pi() {
        double s = 1;
        double i = 1;
        while (1.0 / (2 * i + 1) > E) {
            s = s + Math.pow(-1, i) / (2 * i + 1);
            i++;
        }
        return s * 4;
    }
}