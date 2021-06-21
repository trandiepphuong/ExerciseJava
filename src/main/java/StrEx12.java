public class StrEx12 {
    public String max(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (Integer.parseInt(String.valueOf(a[i]) + String.valueOf(a[j])) < Integer.parseInt(String.valueOf(a[j]) + String.valueOf(a[i]))) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            result.append(a[i]);
        }
        return result.toString();
    }
}
