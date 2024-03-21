class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int last_index = str.lastIndexOf(' ');
        return str.length() - (last_index + 1);
    }
}