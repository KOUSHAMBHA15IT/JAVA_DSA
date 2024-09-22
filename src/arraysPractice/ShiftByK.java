package arraysPractice;

public class ShiftByK {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6}; int k=3;
        for(int i=0;i<6;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        shift(a,k);
    }

    private static void shift(int[] a, int k) {
        int n = a.length;
        int[] an= new int[n];
        for(int i=0;i<n;i++){
            an[(i+k)%n] = a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(an[i]+ " ");
        }
    }
}
