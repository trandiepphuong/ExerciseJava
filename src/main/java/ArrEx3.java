public class ArrEx3 {
    public int oddEven(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            } else {
                sum -= a[i];
            }
        }
        return sum;
    }
}
