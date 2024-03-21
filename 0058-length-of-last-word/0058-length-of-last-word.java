class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) == ' '){
                return (str.length()-i-1);
            }
                
        }
        return str.length();
    }
}