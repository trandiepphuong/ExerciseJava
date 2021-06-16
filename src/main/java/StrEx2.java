public class StrEx2 {
    public boolean checkPalindrome(String n) {
        int length = n.length();
        String reverseStr = "";
        for (int i = length - 1; i >= 0; i--)
            reverseStr = reverseStr + n.charAt(i);
        if (n.equals(reverseStr)) return n.equals(reverseStr);
        return false;
    }
}
