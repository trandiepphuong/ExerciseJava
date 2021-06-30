public class StrEx10 {

    private int getDigitFromRight(String str, int position) {
        if (str.length() > position) {
            return str.charAt(str.length() - position - 1) - '0';
        }
        return 0;
    }

    public String sum(String s1, String s2) {
        int maxLength = Math.max(s1.length(), s2.length());
        StringBuffer buffer = new StringBuffer();
        int memory = 0;
        for (int i = 0; i <= maxLength; i++) {
            int sum = getDigitFromRight(s1, i) + getDigitFromRight(s2, i) + memory;
            if (memory == 1 || i < maxLength) {
                buffer.insert(0, sum % 10);
            }
            memory = sum / 10;
        }
        return buffer.toString();
    }
}
