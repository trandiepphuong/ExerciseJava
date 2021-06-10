public class Ex12 {
    double PRECISE = 0.0001;

    public double canbac2(int a) {
        double fn = a;
        while (Math.abs(fn * fn - a) >= PRECISE)
            fn = a / (2 * fn) + fn / 2;
        return fn;
    }

}
