class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] arr = new int[nums.length] ;
        
        int left = 0 ;
        while(left < nums.length) {
            int prod = 1 ;
            for(int i = 0 ; i < nums.length ; i ++) {
                if(i == left) {
                    continue ;
                }
                else {
                    prod *= nums[i] ;
                }
            }
            arr[left] = prod ;
            left ++ ;
        }

        return arr ;
    }
}  
