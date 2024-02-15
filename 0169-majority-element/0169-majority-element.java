class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int k = nums.length/2;
        if(nums[0]==nums[k]){
            return nums[0];
        }
        else{
            return nums[k+1];
        }
    }
}