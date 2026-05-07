class Solution {
    public boolean canAliceWin(int[] nums) {
        int s1=0;
        int s2=0;
        for(int i:nums){
            if(i>9){
                s1+=i;
            }else{
                s2+=i;
            }
        }
        return s1!=s2;
    }
}