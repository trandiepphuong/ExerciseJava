public class StrEx7 {
    public String dich(String n) {
        String newStr = "";
        int lenghtNum = 0;
        int currentSum = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (!Character.isDigit(ch)) {
                lenghtNum = 0;
                newStr += ch;
                currentSum = 0;
            } else {
                lenghtNum++;
                currentSum = 10 * currentSum + ch - '0';
                for (int j = 1; j < currentSum; j++) {
                    newStr += n.charAt(i - lenghtNum);
                }
            }
        }
        return newStr;
    }
}
