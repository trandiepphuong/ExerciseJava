import java.util.Arrays;
import java.util.Comparator;

public class ArrEx4 implements Comparator<Integer> {

    public String sortOddEven(Integer[] arr) {
        Arrays.sort(arr, this);
        return Arrays.toString(arr);
    }

    @Override
    public int compare(Integer left, Integer right) {
        if (left.equals(right)) return 0;
        if (left % 2 + right % 2 == 0) return left - right;
        if (left % 2 + right % 2 == 2) return right - left;
        return left % 2 - right % 2;
    }
}
