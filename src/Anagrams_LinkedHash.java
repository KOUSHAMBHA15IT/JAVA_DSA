/*
Given an array of strings, return all groups of strings that are anagrams. The groups must be created in order of their appearance in the original array. Look at the sample case for clarification.

Note: The final output will be in lexicographic order.

Examples:

Input: arr[] = ["act", "god", "cat", "dog", "tac"]
Output: [["act", "cat", "tac"], ["god", "dog"]]
Explanation: There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.
*/
class Solution {
     public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // Map to group words by their sorted characters
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();

        for (String word : arr) {
            // Sort the characters of the word to create the key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Add the word to the corresponding group in the map
            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);
        }

        // Collect the groups into the final result
        return new ArrayList<>(map.values());
     }
}
