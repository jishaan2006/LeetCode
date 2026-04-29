class Solution {
    public int pivotIndex(int[] nums) {
        int lsum=0;
        int total=0;
        for(int i:nums){
            total+=i;
        }
         
        for(int i=0;i< nums.length;i++){
            int rsum=total-lsum-nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}