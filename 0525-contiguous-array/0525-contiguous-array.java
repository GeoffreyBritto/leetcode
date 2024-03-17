class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int count = 0;

        // Initialize the hashmap with the difference count 0 and index -1.
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            // If it's 0, we increment the count; otherwise, decrement it.
            count += nums[i] == 0 ? 1 : -1;

            // If we've seen this difference before, calculate the length and update maxLength.
            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                // Otherwise, put the current count along with its index into the map.
                map.put(count, i);
            }
        }

        return maxLength;
    }
}