class Solution {
    public int removeElement(int[] nums, int val) {
          int occur=0;
        for(int n:nums){
            if(n!=val){
                nums[occur++]=n;
            }
        }
        return occur;
    }
}