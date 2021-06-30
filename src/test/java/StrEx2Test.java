import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrEx2Test {
    @Test
    public void test_checkPalindrome() {
        assertEquals(new StrEx2().checkPalindrome("abcdcba"), true);
        assertEquals(new StrEx2().checkPalindrome("abcdabc"), false);
    }
}
