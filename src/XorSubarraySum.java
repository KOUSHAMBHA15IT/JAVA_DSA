/*
Given an array of integers arr[] and a number k, count the number of subarrays having XOR of their elements as k.

Examples: 

Input: arr[] = [4, 2, 2, 6, 4], k = 6
Output: 4
Explanation: The subarrays having XOR of their elements as 6 are [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], and [6]. Hence, the answer is 4.
*/

class Solution {
    public long subarrayXor(int arr[], int k) {
        HashMap<Integer,Integer> fre = new HashMap<>();
        int x=0;long c=0;
        for(int i:arr){// cal the prefix
            x^=i;
            
            if(x==k)c++;
            
            int reqXor = x^k;
            // If xor ^ k exists in the map, add its frequency to the count
            c+= fre.getOrDefault(reqXor,0);
            
            // Update the frequency of the current prefix XOR in the map
            fre.put(x,fre.getOrDefault(x,0)+1);
        }
        return c;
    }
}
