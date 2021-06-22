public class StrEx2 {
    public boolean checkPalindrome(String n) {
        for (int i = n.length() - 1; i >= 0; i--) {
            if (n.charAt(i) != n.charAt(n.length() - 1 - i)) return false;
        }
        return true;
    }
}
