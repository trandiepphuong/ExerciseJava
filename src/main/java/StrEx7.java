public class StrEx7 {
    public String dich(String n) {
        StringBuffer newStr = new StringBuffer();
        int lengthNum = 0;
        int currentSum = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (!Character.isDigit(ch)) {
                lengthNum = 0;
                currentSum = 0;
                if (i == n.length() - 1 || (i != n.length() - 1) && !Character.isDigit(n.charAt(i + 1))) {
                    System.out.println(n.charAt(i));
                    newStr.append(n.charAt(i));
                }
            } else {
                lengthNum++;
                currentSum = 10 * currentSum + ch - '0';
                if ((i == n.length() - 1) || (i != n.length() - 1 && !Character.isDigit(n.charAt(i + 1)))) {
                    System.out.println(n.charAt(i - lengthNum) + " repeat " + currentSum);
                    for (int j = 0; j < currentSum; j++) {
                        newStr.append(n.charAt(i - lengthNum));
                    }
                }
            }
        }
        return newStr.toString();
    }
}
