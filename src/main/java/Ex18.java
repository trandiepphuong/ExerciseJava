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
            char temp = roman.charAt(i);
            switch (temp) {
                case ('I'): {
                    a[i] = 1;
                    break;
                }
                case ('V'): {
                    a[i] = 5;
                    break;
                }
                case ('X'): {
                    a[i] = 10;
                    break;
                }
                case ('L'): {
                    a[i] = 50;
                    break;
                }
                case ('C'): {
                    a[i] = 100;
                    break;
                }
                case ('D'): {
                    a[i] = 500;
                    break;
                }
                case ('M'): {
                    a[i] = 1000;
                    break;
                }
            }
        }
        int k = a[roman.length() - 1];
        for (int i = roman.length() - 1; i > 0; i--) {
            if (a[i] > a[i - 1])
                k = k - a[i - 1];
            else
                k = k + a[i - 1];
        }
        return k;
    }
}
