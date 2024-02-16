class Solution {
    public int searchInsert(int[] nums, int target) {
        int first = 0, last = nums.length - 1, mid = 0;
        while(first <= last){
            mid = (first + last)/2;
            if(target > nums[mid]){
                first = mid + 1;
            }
            else if(target < nums[mid]){
                last = mid - 1;
            }
            else{
                return mid;
            }
        }
        return first;
    }
}