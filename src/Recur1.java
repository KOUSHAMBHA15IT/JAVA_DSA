public class Recur1 {
    public static void main(String[] args){
        System.out.println(message(1));
    }

    public static String message(int n){
        String s = "Koushambha Das\n";

        if (n == 5) return "";
        else {
            return s + message(++n);
        }
    }
}
