class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squaredArray = Arrays.stream(nums)
                                   .map(x -> x * x)
                                   .toArray();
        Arrays.sort(squaredArray);
        return squaredArray;
    }
}