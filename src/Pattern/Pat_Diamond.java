package Pattern;

public class Pat_Diamond {
    public static void main(String args[]){
        diamond(5);
    }
    static void diamond(int n){
        for(int i=0;i<2*n;i++){
            int CinR = i > n ? 2  * n- i : i;
            int spaces= n- CinR;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }

            for(int j=0;j<CinR;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
