class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count = 0, max_frequency = 0, max_count= 0;
        int[] unique_elements = Arrays.stream(nums).distinct().toArray();
        int[] unique_elements_count = new int[unique_elements.length];
        
        for(int i = 0; i < unique_elements.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(unique_elements[i] == nums[j]){
                    count += 1;
                }
                
                if(count > max_count){
                    max_count = count;
                }
            }
            unique_elements_count[i] = count;
            count = 0;
        }
        
        for(int i = 0; i < unique_elements_count.length; i++){
            if(max_count == unique_elements_count[i]){
                max_frequency += unique_elements_count[i];
            }
        }
        
        return max_frequency;
    }
}