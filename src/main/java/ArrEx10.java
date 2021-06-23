import java.util.Arrays;

public class ArrEx10 {
    public String insert(int arr[], int x) {
        int[] newArr = new int[arr.length];
        int i;
        for (i = 0; i < arr.length; i++) {
            if (x < arr[i]) {
                int[] result = new int[arr.length + 1];
                for (int j = 0; j < i; j++) {
                    result[j] = arr[j];
                }
                result[i] = x;
                for (int j = i; j < arr.length; j++) {
                    result[j + 1] = arr[j];
                }
                return Arrays.toString(result);
            } else {
                newArr = Arrays.copyOf(arr, arr.length + 1);
                newArr[arr.length] = x;
            }
        }
        return Arrays.toString(newArr);
    }

}
