class Solution {
    public long largestPerimeter(int[] nums) {
        long sum = 0L;
        int k=nums.length; 
        Arrays.sort(nums);
        for(int j = 0; j<nums.length; j++){
            sum = sum + nums[j];
        }
        
        for(int i=nums.length-1; i>0; i--){
            sum = sum - nums[i];
            if(nums[i]>=sum){
                k -= 1;
            }
            else{
                sum = sum+nums[i];
                break;
            }
        }
        if(k<3){
            return -1;
        }
        else{
            return sum;
        }
    }
}