class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int key = 0;
        for(int i = 0; i < nums1.length; i++){
            key = b_s(nums2, 0, nums2.length-1, nums1[i]);
            if(key != -1){
                return nums1[i];
            }else{
                continue;
            }
        }
        return -1;
    }
    
    public int b_s(int[] nums2, int first, int last, int target){
        int mid = 0;
        while(first <= last){
            mid = (first + last)/2;
            
            if(target == nums2[mid]){
                return mid;
            }else if(target < nums2[mid]){
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return -1;
    }
}