public class StrEx12 {
    public String max(int[] a) {
        String temp;
        String[] strArray = new String[a.length];
        String result = "";
        for (int i = 0; i < a.length; i++) {
            strArray[i] = String.valueOf(a[i]);
        }
        for (int i = 0; i < strArray.length; i++)
            for (int j = i + 1; j < strArray.length; j++)
                if (Integer.parseInt(strArray[i] + strArray[j]) > Integer.parseInt(strArray[j] + strArray[i])) {
                    temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
        for (int i = strArray.length - 1; i >= 0; i--) {
            result += strArray[i];
        }
        return result;
    }
}
