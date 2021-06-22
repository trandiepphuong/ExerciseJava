import java.util.Arrays;

public class ArrEx10 {
    public int[] addElement(int[] a, int pos, int num) {
        int[] result = new int[a.length + 1];
        for (int i = 0; i < pos; i++) {
            result[i] = a[i];
        }
        result[pos] = num;
        for (int i = pos; i < a.length; i++) {
            result[i + 1] = a[i];
        }
        return result;
    }

    public String insert(int arr[], int x) {
        int[] newArr = new int[arr.length];
        int i;
        for (i = 0; i < arr.length; i++) {
            if (x < arr[i]) {
                return Arrays.toString(addElement(arr, i, x));
            } else {
                newArr = Arrays.copyOf(arr, arr.length + 1);
                newArr[arr.length] = x;
            }
        }
        return Arrays.toString(newArr);
    }

}
