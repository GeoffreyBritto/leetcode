class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0, min = 0;
        while(i < nums.length){
            if(nums[i] > min && nums[i] < nums.length){
                int correct = nums[i];
                if(nums[i] != nums[correct - 1]){
                    swap(nums, i, correct-1);
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
    
    public void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}