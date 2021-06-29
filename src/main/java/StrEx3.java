public class StrEx3 {
    public int sumInt(String input) {
        int sum = 0;
        int currentSum = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isDigit(ch)) {
                sum += currentSum;
                currentSum = 0;
            } else {
                currentSum = 10 * currentSum + ch - '0';
            }
        }
        return sum + currentSum;
    }
}
