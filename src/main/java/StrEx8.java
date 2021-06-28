public class StrEx8 {
    public boolean checkBarcode(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum += 3 * digit;
            }
        }
        return sum % 10 == 0;
    }
}
