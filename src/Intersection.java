/*Given two integer arrays a[] and b[], you have to find the intersection of the two arrays. Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not have duplicate elements and the result should contain items in any order.

Note: The driver code will sort the resulting array in increasing order before printing.
Input: a[] = [1, 2, 1, 3, 1], b[] = [3, 1, 3, 4, 1]
Output: [1, 3]
*/
class Intersection {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
       ArrayList<Integer> ar = new ArrayList<>();
       HashSet<Integer> h = new HashSet<>();
       
       for(int i: a){
           h.add(i);
       }
       
       for(int i:b){
           if(h.contains(i)){ ar.add(i);
               h.remove(i);
           }
       }
       
       return ar;
    }
}
