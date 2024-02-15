class Solution {
    public void rotate(int[] nums, int k) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        int p = k % nums.length;
        int pointer = p;
        for(int i = 0; i<nums.length; i++){
            if(p>0){
                nums[i] = copy[nums.length - p];
                p -= 1;
            }
            else{
                nums[i] = copy[i-pointer];
            }
        }
    }
}