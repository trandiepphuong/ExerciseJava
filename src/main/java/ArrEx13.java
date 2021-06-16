import java.util.Arrays;

public class ArrEx13 {
    public String delRowCol(int[][] arr, int delRow, int delCol) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] newArr = new int[rows - 1][cols - 1];
        int p = 0;
        for (int i = 0; i < rows; i++) {
            if (i == delRow) {
                continue;
            }
            int q = 0;
            for (int j = 0; j < cols; j++) {
                if (j == delCol) {
                    continue;
                }
                newArr[p][q] = arr[i][j];
                q++;
            }
            p++;
        }
        return Arrays.deepToString(newArr);
    }
}
