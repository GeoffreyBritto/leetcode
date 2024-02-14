class Solution {
    public int removeElement(int[] nums, int val) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        int k = 0;
        int last = nums.length - 1;
        
        for(int i = 0; i<nums.length; i++){
            if(copy[i] != val){
                nums[k] = copy[i];
                k += 1;
            }
            else{
                nums[last] = copy[i];
                last -= 1;
            }
        }
        return k;
    }
}