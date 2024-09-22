package BitManupulation;

public class Bitwise_odd_even {
    public static void main(String args[]){
        System.out.println(isOdd(5));
    }

    public static boolean isOdd(int n){
        if((n & 1) == 1) return true;
        return false;
    }


}
