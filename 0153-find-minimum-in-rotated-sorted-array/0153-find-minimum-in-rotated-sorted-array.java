class Solution {
    public int findMin(int[] nums) {
        int first = 0, last = nums.length - 1, min = 0;
        min = pivot(nums, first, last);
        return nums[min];
    }
    
    public int pivot(int[] nums, int first, int last){
        int mid = 0;
        while(first < last){
            mid = (first + last) / 2;
            if(nums[first] > nums[mid]){
                last = mid - 1;
                if(nums[last] > nums[last+1]){
                    return last+1;
                }
            }else{
                first = mid + 1;
                if(nums[first-1] > nums[first]){
                    return first;
                }
            }
        }
        return 0;
    }
}