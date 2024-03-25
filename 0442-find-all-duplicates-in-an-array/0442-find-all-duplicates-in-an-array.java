class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0, correct = 0;
        List<Integer> answer = new ArrayList<Integer>();
        while(i < nums.length){
            correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                answer.add(nums[j]);
            }
        }
        
        return answer;
    }
    
    public void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}