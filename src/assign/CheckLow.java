package assign;

public class CheckLow { // Output  :  gvxvdfygyg : 10

    public static void main(String[] args) {
        String s ="GYIgvxvdfyYgyg";
        lower(s);
    }

    private static void lower(String s) {
        int l = s.length();
        String n =""; int f=0;
        for(int i= 0;i<l;i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c)==true){
                n=n + c;f++;
            }
        }

        System.out.println(n + " : " + f);
    }
}
