class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int [] t=new int[n+1];int z=0;int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                t[k++]=nums[i];
            }else z++;

        }
        for(int i=0;i<z;i++){
            t[k++]=0;
        }
        for(int i=0;i<n;i++){
            nums[i]=t[i];
        }
    }
}
