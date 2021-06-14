import java.util.*;

public class ArrEx1 {
    public String twiceInArr(int array[]) {
        List<String> result = new ArrayList<String>();
        Arrays.sort(array);
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) ++count;
            else {
                if (count >= 2) {
                    result.add(String.valueOf(array[i]));
                }
                count = 1; //reset bien count
            }
        }
        return String.join(", ", result);
    }
}
