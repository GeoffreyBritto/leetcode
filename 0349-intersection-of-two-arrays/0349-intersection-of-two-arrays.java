class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> answer = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    answer.add(nums1[i]);
                }
            }
        }
        
        Integer[] arr = answer.toArray(new Integer[0]); 


        int[] intArr = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        
        return intArr;
    }
}