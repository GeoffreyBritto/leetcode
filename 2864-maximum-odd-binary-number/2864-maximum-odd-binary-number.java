class Solution {
    public String maximumOddBinaryNumber(String s) {
        int p = 0, q = 0;
        StringBuilder ans = new StringBuilder(s.length());
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                p += 1;
            }else{
                q += 1;
            }
        }
        for(int i = 0; i < p-1; i++){
            ans.append('1');
        }
        for(int j = p-1; j < p - 1 + q; j++){
            ans.append('0');
        }
        ans.append('1');
        String answer = ans.toString();
        return answer;
    }
}