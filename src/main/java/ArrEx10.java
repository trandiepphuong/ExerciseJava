import java.util.Arrays;

public class ArrEx10 {
    public String insert(int arr[], int x) {
        boolean isMid = false;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i] && x > arr[i - 1]) {
                for (int j = 0; j < i; j++) {
                    newArr[j] = arr[j];
                }
                newArr[i] = x;
                for (int j = i + 1; j < newArr.length; j++) {
                    newArr[j] = arr[j - 1];
                }
                isMid = true;
                break;
            }
        }
        if (isMid==false){
            newArr = Arrays.copyOf(arr, arr.length + 1);
            newArr[arr.length] = x;
        }
        return Arrays.toString(newArr);
    }
}
