package assign;

public class ArrayString {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        System.out.println(str(a));
    }

    private static String str(int[] a) {
        String s= "";
        for(int i: a){
            if(i%2==0) s=s+ "EVEN";
            else s=s+ "ODD";
        }
        return s;
    }
}
