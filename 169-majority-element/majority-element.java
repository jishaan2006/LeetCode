class Solution {
    public int majorityElement(int[] nums) {
        int freq=1;
        int candidate=nums[0];
        for(int i=1;i<nums.length;i++){
            if(freq==0){
                candidate=nums[i];
            }
            if(nums[i]==candidate){
                freq++;
            }else{
                freq--;
            }
        }
        return candidate;
    }
}