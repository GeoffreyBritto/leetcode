class Solution {
    public int findMin(int[] nums) {
        int first = 0, last = nums.length - 1, min = 0;
        if(nums.length == 2){
            if(nums[0] > nums[1]){
                return nums[1];
            }else{
                return nums[0];
            }
        }else{
            min = min(nums, first, last);
            return nums[min];
        }
    }
    
    public int min(int[] nums, int first, int last){
        int mid = 0;
        while(first < last){
            mid = (first + last) / 2;
            if(nums[first] > nums[mid]){
                last = mid - 1;
                if(nums[last] > nums[last+1]){
                    return last+1;
                }
            }else if(nums[first] < nums[last]){
                first = mid + 1;
                if(nums[first-1] > nums[first]){
                    return first;
                }
            }else{
                for(int i = mid+1; i <= last; i++){
                    if(nums[i] < nums[first]){
                        return i;
                    }
                }
                last = mid - 1;
                if(last == -1) continue;
                if(nums[last] > nums[last+1]){
                    return last+1;
                }
            }
        }
        return 0;
    }
}