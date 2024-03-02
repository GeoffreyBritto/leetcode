class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = 0, last = nums.length - 1, f_pos = 0, l_pos = 0, find = 0;
        int[] ans = new int[2];
        find = find(nums, first, last, target);
        if(find == -1){
            ans[0] = -1;
            ans[1] = -1;
        }else{
            f_pos = first_pos(nums, first, last, target);
            l_pos = last_pos(nums, first, last, target);
            ans[0] = f_pos;
            ans[1] = l_pos;
        }
        return ans;
    }
    
    public int find(int[] nums, int first, int last, int target){
        int mid = 0;
        while(first <= last){
            mid = (first + last)/2;
            if(target < nums[mid]){
                last = mid - 1;
            }else if(target > nums[mid]){
                first = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
    public int first_pos(int[] nums, int first, int last, int target){
        int mid = 0;
        while(first <= last){
            mid = (first + last)/2;
            if(target <= nums[mid]){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return first;
    }
    
    public int last_pos(int[] nums, int first, int last, int target){
        int mid = 0;
        while(first <= last){
            mid = (first + last)/2;
            if(target < nums[mid]){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        if(last >= nums.length){
            return -1;
        }else{
            return last;
        }
    }
}