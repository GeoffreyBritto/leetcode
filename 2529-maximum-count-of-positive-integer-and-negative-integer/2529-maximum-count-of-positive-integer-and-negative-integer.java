class Solution {
    public int maximumCount(int[] nums) {
        int first = 0, last = nums.length - 1, pos = 0, neg = 0, count = 0;
        neg = floor(nums, first, last, 0) + 1;
        count = ciel(nums, first, last, 0) - floor(nums, first, last, 0) - 1;
        pos = nums.length - neg - count;
        return Math.max(neg, pos);
    }
    
    public int floor(int[] nums, int first, int last, int target){
        int mid = 0;
        while(first <= last){
            mid = (first + last) / 2;
            if(target <= nums[mid]){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return last;
    }
    
    public int ciel(int[] nums, int first, int last, int target){
        int mid = 0;
        while(first <= last){
            mid = (first + last) / 2;
            if(target < nums[mid]){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return first;
    }
}