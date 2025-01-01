/*
Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number k.

Examples:

Input: arr = [10, 2, -2, -20, 10], k = -10
Output: 3
Explaination: Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10.
*/
class Solution {
    public int countSubarrays(int arr[], int k) {
        HashMap<Integer,Integer> psum =new HashMap<>();
        psum.put(0,1);
        int c=0; int presum=0;
        for(int i:arr){
            presum+=i;
            if(psum.containsKey(presum-k)){
                c+=psum.get(presum-k);
            }
            psum.put(presum,psum.getOrDefault(presum,0)+1);
        }
        
        return c;
    }
}
