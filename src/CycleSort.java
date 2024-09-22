import java.util.Arrays;

public class CycleSort {
    public static void main(String args[]){
        int arr[]={3,4,2,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[]) {
        int i = 0;
        while(i<arr.length){
            int corId = arr[i] - 1;
            if (arr[i] != arr[corId]) {
                swap(arr, i, corId);
            } else {
                i++;
            }
          }
        }

        static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        }



}
