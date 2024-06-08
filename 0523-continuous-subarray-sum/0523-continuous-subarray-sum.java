
public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Initialize a hashmap to store the modulo result and the corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();
        // We need to handle the case where the subarray starts from the beginning,
        // so we initialize the map with (0, -1)
        map.put(0, -1);
        int sum = 0;
        
        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int mod = sum % k;
            // Handling negative modulus
            if (mod < 0) {
                mod += k;
            }
            // If this mod value has been seen before
            if (map.containsKey(mod)) {
                // Check if the length of the subarray is at least 2
                if (i - map.get(mod) > 1) {
                    return true;
                }
            } else {
                // Store the index of the first occurrence of this mod value
                map.put(mod, i);
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println(solution.checkSubarraySum(nums, k)); // Output: true
        
        int[] nums2 = {23, 2, 6, 4, 7};
        int k2 = 6;
        System.out.println(solution.checkSubarraySum(nums2, k2)); // Output: true
        
        int[] nums3 = {23, 2, 6, 4, 7};
        int k3 = 13;
        System.out.println(solution.checkSubarraySum(nums3, k3)); // Output: false
    }
}
