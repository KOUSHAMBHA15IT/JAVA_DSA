package assign;

public class Special_Fibo {

    public static void main(String[] args) {
        series(10);
    }

    private static void series(int i) {
        int a= 1,b=2;
        System.out.println(a);
        System.out.println(b);

        int n=3;
        while(n<=i){
            n++;
            int c = a + b - 3;
            System.out.println(c);
            a=b;b=c;
        }

    }
}
