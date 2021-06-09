public class Ex1 {
    public static int LCM(int a, int b){
        while(a!=b){
            if (a>b) a=a-b; else b=b-a;
        }
        return a;
    }
    public static int GCD(int a, int b){
        return a*b/LCM(a,b);
    }
}
