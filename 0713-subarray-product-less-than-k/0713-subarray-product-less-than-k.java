class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; // If k is less than or equal to 1, no subarray will have product less than k
        
        int count = 0;
        int product = 1;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            
            // Shrink the window from the left until the product is less than k
            while (product >= k) {
                product /= nums[left];
                left++;
            }
            
            // Add the number of subarrays ending at the current right index
            count += right - left + 1;
        }
        
        return count;
    }
}