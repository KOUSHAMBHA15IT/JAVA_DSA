package BitManupulation;

public class Bitwise {
    public static void main(String args[]){
        int a=5;
        System.out.println(Integer.toBinaryString(a));
        int c = a<<1;//left shift
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
        int d = a>>1;//left shift
        System.out.println(d);
        System.out.println(Integer.toBinaryString(d));
        int x= c ^ d;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }
}
