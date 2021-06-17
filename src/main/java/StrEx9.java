public class StrEx9 {
    public int verifyBarcode(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(n.charAt(i)));
            if ((i + 1) % 2 != 0) {
                sum += digit;
            } else {
                sum += 3 * digit;
            }
        }
        int rounded = ((sum + 9) / 10 ) * 10;
        return rounded-sum;
    }
}
