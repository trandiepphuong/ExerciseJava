import java.util.Arrays;

public class ArrEx10 {
    public String insert(int arr[], int x) {
        boolean inserted = false;
        int pos = 0;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x && !inserted) {
                newArr[pos] = x;
                pos++;
                inserted = true;
            }
            newArr[pos] = arr[i];
            pos++;
        }
        if (!inserted) { //neu chua chen thi so do la so lon nhat
            newArr[arr.length] = x;
        }
        return Arrays.toString(newArr);
    }
}
