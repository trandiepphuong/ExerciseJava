public class StrEx12 {
    public String max(int[] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (Integer.parseInt(a[i] + "" + a[j]) < Integer.parseInt(a[j] + "" + a[i])) {
                    int temp = a[i];
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
