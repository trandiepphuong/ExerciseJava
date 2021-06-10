import java.util.*;

public class Ex14 {
    public boolean armstrong(int n) {
        int S = 0;
        int m = 0;
        int p = n;
        int q = n;
        while (n > 0) {
            n = n / 10;
            m++;
        }
        for (int l = 1; l <= m; l++) {
            int z = p % 10;
            p = p / 10;
            S += Math.pow(z, m);
        }
        if (S == q)
            return true;
        else
            return false;
    }
    public String listArmstrong(){
        String result = "";
        for (int i=10;i<=99999;i++){
            if (armstrong(i)) result+=i+", ";
        }
        return result;
    }
}

//153,
//        370,
//        371,
//        407,
//        1634,
//        8208,
//        9474,
//        54748,
//        92727,
//        93084,
