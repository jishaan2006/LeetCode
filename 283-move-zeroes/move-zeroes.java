class Solution {
    public void moveZeroes(int[] nums) {
        int move=0;
        for(int n:nums){
            if(n!=0){
                nums[move++]=n;
            }
        }
        while(move<nums.length){
            nums[move++]=0;
        }
    }
}