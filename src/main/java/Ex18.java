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
    public int getDecimal(char temp) {
        switch (temp) {
            case ('I'): {
                return 1;
            }
            case ('V'): {
                return 5;
            }
            case ('X'): {
                return 10;
            }
            case ('L'): {
                return 50;
            }
            case ('C'): {
                return 100;
            }
            case ('D'): {
                return 500;
            }
            case ('M'): {
                return 1000;
            }
        }
        return 0;
    }

    public int covertToDecimal(String roman) {
        int[] a = new int[roman.length()];
        for (int i = 0; i < roman.length(); i++) {
            char temp = roman.charAt(i);
            a[i] = getDecimal(temp);
        }
        int k = a[roman.length() - 1];
        for (int i = roman.length() - 1; i > 0; i--) {
            if (a[i] > a[i - 1]) {
                k = k - a[i - 1];
            } else {
                k = k + a[i - 1];
            }
        }
        return k;
    }
}
