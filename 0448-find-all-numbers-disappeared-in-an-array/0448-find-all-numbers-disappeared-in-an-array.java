class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List<Integer> ans = new ArrayList<Integer>();
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] != nums[correct - 1]){
                swap(nums, i, correct - 1);
            }else{
                i++;
            }
        }
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1){
                ans.add(j+1);
            }
        }
        
        return ans;
    }
    
    public void swap(int[] nums, int first, int last){
        int temp = 0;
        
        temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}