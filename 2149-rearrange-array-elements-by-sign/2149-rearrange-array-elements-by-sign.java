class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive_int = Arrays.stream(nums).filter(n -> n>0).toArray();
        int[] negative_int = Arrays.stream(nums).filter(n -> n<0).toArray();
        int j = 0, k = 0;
        for(int i=0; i<nums.length; i++){
            if( (i+1) % 2 == 0){
                nums[i] = negative_int[j];
                j = j+1;
            }
            else if( (i+1) % 2 != 0){
                nums[i] = positive_int[k];
                k = k+1;
            }
        }
        return nums;
    }
}