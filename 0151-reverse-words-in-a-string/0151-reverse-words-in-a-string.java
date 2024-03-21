class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        
        // Split the string into words
        String[] words = s.split("\\s+"); // "\\s+" matches one or more whitespace characters
        
        // Reverse the array of words
        reverseArray(words);
        
        // Concatenate the reversed words into a single string
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }
        
        // Remove the trailing space and return the result
        return result.toString().trim();
    }
    
    public static void reverseArray(String[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Swap elements at left and right indices
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            // Move indices towards the center
            left++;
            right--;
        }
    }
}