class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int a=-1;int smax=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            
            if(arr[i]!=smax){
                a=arr[i];break;
            }
        }
        
        return a;
    }
}
