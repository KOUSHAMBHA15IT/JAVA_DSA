// Input: nums = [3,0,1] Output: 2
// Input: nums = [0,1] Output: 2
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]!=i) return i;
        }
        return nums[n-1]+1;
    }
}
