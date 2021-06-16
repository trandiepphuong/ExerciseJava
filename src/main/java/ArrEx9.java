public class ArrEx9 {
    public int binarySearch(int arr[], int x) {
        int r = arr.length - 1;
        int l = 0;
        while (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                r = mid - 1;
            if (arr[mid] < x)
                l = mid + 1;
        }
        return -1;
    }
}
