public class StrEx2 {
    public boolean checkPalindrome(String n) {
        String reverseStr = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + n.charAt(i);
        }
        return n.equals(reverseStr);
    }
}
