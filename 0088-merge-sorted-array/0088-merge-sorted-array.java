class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int j = 0, i;
        int temp, max;
        
        for(i = m; i<m+n; i++){
            nums1[i] = nums2[j];
            j++;
        }
        
        for(i = 0; i < nums1.length-1; i++){
            max = i;
            
            for(j = i+1; j < nums1.length; j++){
                if(nums1[j] < nums1[max]){
                    max = j;
                }
            }
            
            if(max != i){
                temp = nums1[i];
                nums1[i] = nums1[max];
                nums1[max] = temp;
            }
            else{
                continue;
            }
        }
        
    }
}