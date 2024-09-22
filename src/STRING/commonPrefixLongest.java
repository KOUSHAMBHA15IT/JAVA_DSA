package STRING;

import java.util.Arrays;

public class commonPrefixLongest {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix); // Output: "fl"    }
}

    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        for (int i = 0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
        String chotu = strs[0];
        String lombu = strs[strs.length-1];
        int min = Math.min(chotu.length(),lombu.length());

        int c=0;
        while(c<min &&  chotu.charAt(c)==lombu.charAt(c)){
            c++;
        }

        return chotu.substring(0,c);
    }
}
