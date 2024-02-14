class Solution {
    public int[] twoSum(int[] nums, int target) {
        int range = nums.length;
        int[] output = new int[2];
        int i = 0;
        int j = 0;
        for(i=0; i<range-1; i++){
            for(j=i+1; j<range; j++){
                if(nums[i]+nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
        }

        return output;
    }
}