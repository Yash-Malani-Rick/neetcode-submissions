class Solution {
    public int maxArea(int[] arr) {
        int sum = 0;
        int curr = 0 ;
        int left = 0 ;
        int right = arr.length - 1 ;
        while(left <= right) {

            curr = (right - left) * Math.min(arr[left] , arr[right]) ;
            if(arr[left] >= arr[right]) right -- ;
            else left ++ ;
            
            sum = Math.max(curr , sum) ;
        }

        return sum ;
    }
}
