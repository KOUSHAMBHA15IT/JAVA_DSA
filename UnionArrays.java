// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> hs =new HashSet<>();
        
        for(int i:a){
            hs.add(i);
        }
        for(int i:b){
            hs.add(i);
        }
        ArrayList<Integer> al=new ArrayList<>(hs);
        Collections.sort(al);
        
        return al;
    }
}

// Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
// Output: 1 2 3 4 5 6 7
// Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
