class Solution {
    public int minimumLength(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char target = s.charAt(left);
            while (left <= right && s.charAt(left) == target) {
                left++;
            }
            while (right >= left && s.charAt(right) == target) {
                right--;
            }
        }
        
        return Math.max(0, right - left + 1);
    }
}