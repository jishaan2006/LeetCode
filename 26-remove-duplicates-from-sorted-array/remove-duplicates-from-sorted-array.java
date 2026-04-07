class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){

            }else{
                set.add(nums[i]);
                nums[c]=nums[i];
                c++;
            }
        }
        return c;
    }
}