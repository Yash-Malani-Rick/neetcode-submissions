class Solution {
    public int maxSubArray(int[] nums) {
        // if(nums.length==1)return nums[0];
        int curr=0;
        int max=nums[0];
        for(int a:nums){
            if(curr<0){
                curr=0;
            }
            curr+=a;
            max=Math.max(curr,max);
        }
        return max;
    }
}
