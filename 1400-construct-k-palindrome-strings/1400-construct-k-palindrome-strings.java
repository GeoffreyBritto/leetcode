class Solution {
    public boolean canConstruct(String s, int k) {
        int[] frequency = new int[26];
        int odd = 0, n = s.length();
        
        for(int i = 0; i < s.length(); i++){
            frequency[s.charAt(i) - 'a'] ^= 1;
            odd += frequency[s.charAt(i) - 'a'] > 0 ? 1 : -1;
        }
        
        return odd <= k && k<=n;
    }
}