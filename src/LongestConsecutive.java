/*
Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

Examples:
Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
Output: 6
Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.
*/
class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr == null || arr.length==0){
            return 0;
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i: arr){
            hs.add(i);
        }
        int ls =0; //longest streak
        for(int i:hs){
            if(!hs.contains(i-1)){
                int cur=i;int curs=1;//current num , current streak;
                while(hs.contains(cur+1)){
                    cur++;curs++;
                }
                ls= Math.max(ls,curs);
            }
        }
        return ls;
    }
}
