package assign;

public class StringCheck {
    public static void main(String[] args) {
        String s1= "Hello" , s2 ="hELLO";
        checkfun(s1,s2);
    }

    private static void checkfun(String s1, String s2) {
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
