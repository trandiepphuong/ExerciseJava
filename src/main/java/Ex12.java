public class Ex12 {
    static double PRECISE = 0.0001;

    public static double canbac2(int a) {
        double fn = a;
        while (Math.abs(fn * fn - a) >= PRECISE)
            fn = a/(2*fn)+fn/2;
        return fn;
    }
    public static void main(String args[]){
        System.out.println(canbac2(5));
    }
}
