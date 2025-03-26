public class Main {
    public static boolean wordBreak(String s, String[] d) {
        // code here
        String sent=" ";
        for(String i:d){
            sent+=i;
            
        }
        
        return sent.contains(s);
    }
    public static void main(String args[]){
        String s ="ibike";
        String[] dict = {"i", "like", "gfg"};
        boolean b=wordBreak(s,dict);
        System.out.print(b);
    }
}
