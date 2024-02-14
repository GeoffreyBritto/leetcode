class Solution {
    public int removeDuplicates(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        int k = 1;
        int last = nums.length - 1;
        for(int i = 1; i<nums.length; i++){
            if(copy[i] == copy[i-1]){
                nums[last] = copy[i];
                last -= 1;
            }
            else{
                nums[k] = copy[i];
                k += 1;
            }
        }
        return k;
    }
}