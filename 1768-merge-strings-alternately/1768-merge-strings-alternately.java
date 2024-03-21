class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder();
        int p1 = 0, p2 = 0, i = 0;
        while(answer.length() < word1.length() + word2.length()){
            if(i % 2 == 0){
                if(p1 == word1.length()){
                    i++;
                    continue;
                };
                answer.append(word1.charAt(p1));
                p1++;
                i++;
            }else{
                if(p2 == word2.length()){
                    i++;
                    continue;
                };
                answer.append(word2.charAt(p2));
                p2++;
                i++;
            }
        }
        
        return answer.toString();
    }
}