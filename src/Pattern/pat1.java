package Pattern;
/*
 *   start
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *   end
 */
public class pat1 {
    static void pattern(int n){
        for(int i=0;i<2*n;i++){
          int totCinR = i> n? 2*n-i:i;
          for(int j=0;j<totCinR;j++){
              System.out.print("* ");
          }
          System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(5);
    }

}

