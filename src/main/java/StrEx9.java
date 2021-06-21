public class StrEx9 {
    int round(int n) {
        return ((n + 9) / 10) * 10;
    }

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
        return round(sum) - sum;
    }
}
