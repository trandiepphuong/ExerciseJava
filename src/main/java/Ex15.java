public class Ex15 {
    public static int nhiphannguoc(int n) {
        //n doi sang nhi phan duoc m1
        String m1 = Integer.toBinaryString(n);
        StringBuilder str = new StringBuilder(m1);
        String m2 = str.reverse().toString(); //m2 la dao nguoc nhi phan cua m1
        int decimal = Integer.parseInt(m2, 2); //doi nhi phan thanh thap phan
        return decimal;
    }
}
