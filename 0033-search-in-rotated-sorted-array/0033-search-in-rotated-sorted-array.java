class Solution {
    public int search(int[] nums, int target) {
        int key = 0, first = 0, last = nums.length-1, answer = 0;
        if(nums.length == 1 && nums[0] == target){
            return 0;
        }else if(nums.length == 1 && nums[0] != target){
            return -1;
        }
        key = k_search(nums, first, last);
        if(key == -1){
            answer = b_search(nums, first, last, target);
            return answer;
        }else{
            answer = b_search(nums, first, key, target);
            if(answer == -1){
                answer = b_search(nums, key+1, last, target);
                return answer;
            }else{
                return answer;
            }
        }
    }
    
    public int b_search(int[] nums, int first, int last, int target){
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
    
    public int k_search(int[] nums, int first, int last){
        int mid = 0;
        while(first < last){
            mid = (first + last)/2;
           
            if(nums[mid] < nums[first]){
                last = mid - 1;
                if(nums[last] > nums[last + 1]){
                    return last;
                }
            }else{
                first = mid + 1;
                if(nums[first - 1] > nums[first]){
                    return first-1;
                }
            }
        }
        return -1;
    }
}