package arraysPractice;


public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7, 5};
        int S = 12;
        int[] result = findSubarrayWithSum(nums, S);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] findSubarrayWithSum(int[] nums, int s) {
        for(int i=0;i<nums.length;i++){
            int csum=0;
            for(int j=i;j<nums.length;j++){
                csum+=nums[j];

                if(csum==s){
                    int result[]=new int[j-i+1];
                    for (int k = i; k <= j; k++) {
                        result[k - i] = nums[k];
                    }
                    return result;

                }
            }
        }
        return new int[0];

    }
}

