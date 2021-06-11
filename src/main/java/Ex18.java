public class Ex18 {
//    I   V   X   L   C   D   M
//    1   5   10  50  100 500 1000
//    Chữ số đi sau chữ số khác lớn hơn hoặc bằng thì cộng thêm vào:
//    VI = V + I = 5 + 1 = 6
//    LX = L + X = 50 + 10 = 60
//    XX = X + X = 10 + 10 = 20
//
//    Chữ số đi trước chữ số khác lớn hơn thì trừ bớt đi:
//    IV = V – I = 5 – 1
//    XL = L – X = 50 – 10 = 40
    public int covertToDecimal(String roman) {
        int[] a = new int[roman.length()];
        for (int i = 0; i < roman.length(); i++) {
            if (roman.charAt(i) == 'I')
                a[i] = 1;
            else if (roman.charAt(i) == 'V')
                a[i] = 5;
            else if (roman.charAt(i) == 'X')
                a[i] = 10;
            else if (roman.charAt(i) == 'L')
                a[i] = 50;
            else if (roman.charAt(i) == 'C')
                a[i] = 100;
            else if (roman.charAt(i) == 'D')
                a[i] = 500;
            else if (roman.charAt(i) == 'M')
                a[i] = 1000;
        }
        int k = 0;
        k = a[roman.length() - 1];
        for (int i = roman.length() - 1; i > 0; i--) {
            if (a[i] > a[i - 1])
                k = k - a[i - 1];
            else
                k = k + a[i - 1];
        }
        return k;
    }
}
