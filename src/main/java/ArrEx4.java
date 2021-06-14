import java.util.Arrays;

public class ArrEx4 {
    public void sort(int[] arr, int n) {
        boolean asc = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] % 2 == 0) asc = true;
            for (int j = 0; j < n - i - 1; j++)
                if ((arr[j] > arr[j + 1]) == asc) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
    }

    public String sortOddEven(int[] a) {
        int[] odd = new int[a.length];
        int[] even = new int[a.length];
        int elementOdd = 0;
        int elementEven = 0;
        for (int j : a) {
            if (j % 2 == 0) {
                even[elementEven] = j;
                elementEven++;
            } else {
                odd[elementOdd] = j;
                elementOdd++;
            }
        }

        sort(even, elementEven);
        sort(odd, elementOdd);
        int[] newArr = new int[a.length];
        for (int i = 0; i < elementEven; i++) {
            newArr[i] = even[i];
        }
        for (int i = 0; i < elementOdd; i++) {
            newArr[i + elementEven] = odd[i];
        }
        return Arrays.toString(newArr);
    }

}
