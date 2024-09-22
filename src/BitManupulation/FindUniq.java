package BitManupulation;

public class FindUniq {

    public static void main(String[] args) {
        int ar[]={2,3,2,3,6,4,5,4,5};
        System.out.println(ans(ar));
    }

    private static int ans(int[] ar) {
        int uniq =0;
        for (int i : ar){
            uniq=uniq^i;
        }
        return uniq;
    }
}
