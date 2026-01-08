class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int currsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(currsum<0){
                currsum=nums[i];
            }else{
                currsum+=nums[i];
            }
            if(max<currsum){
                max=currsum;
            }
        }
        return max;
    }
}