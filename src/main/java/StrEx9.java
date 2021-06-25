public class StrEx9 {
    public int verifyBarcode(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum += 3 * digit;
            }
        }
        return (10 - sum % 10) % 10;
    }
}
