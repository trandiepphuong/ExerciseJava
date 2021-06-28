public class StrEx10 {
    public String daoXau(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            s1 += s.charAt(s.length() - 1 - i);
        }
        return s1;
    }

    public String sum(String s1, String s2) {
        StringBuffer s = new StringBuffer();
        int len1 = s1.length();
        int len2 = s2.length();
        int max = Math.max(len1, len2);
        s1 = daoXau(s1);
        s2 = daoXau(s2);

        //thuc hien noi them so 0 vao chuoi voi muc dich lam cho 2 chuoi so bang nhau
        if (max > len1) {
            for (int i = max; i >= len1; i--) {
                s1 += "0";
            }
        }
        if (max > len2) {
            for (int i = max; i >= len2; i--) {
                s2 += "0";
            }
        }
        //thuc hien phep cong
        int nho = 0;
        for (int i = 0; i < max; i++) {
            int tong = s1.charAt(i) + s2.charAt(i) - 2 * '0' + nho;
            s.append(tong % 10);
            nho = tong / 10;
        }
        if (nho == 1) {
            s.append(1);
        }
        return daoXau(s.toString());
    }
}
