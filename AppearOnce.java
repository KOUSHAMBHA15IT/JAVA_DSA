// Input: nums = [4,1,2,1,2]
// Output: 4
class Solution {
    public int singleNumber(int[] nums) {
        int f=0;
        Arrays.sort(nums);
        if(nums.length==1) return nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
             f = f^nums[i];
        }


        return f;
    }
}
