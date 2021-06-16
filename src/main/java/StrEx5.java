import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrEx5 {
    public String appearMore2Time(String n) {
        List<String> result = new ArrayList<>();
        String[] word = n.split(" ");
        Arrays.sort(word);
        int cnt = 0;
        for (int i = 1; i < word.length; i++) {
            if (word[i].equals(word[i - 1])) cnt++;
            else {
                if (cnt >= 2) result.add(word[i - 1]);
                cnt = 1;
            }
        }
        if (cnt >= 2) result.add(word[word.length - 1]);
        return String.join(", ", result);
    }
}