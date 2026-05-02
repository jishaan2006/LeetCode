class Solution {
    public int findLucky(int[] arr) {
        int[] freq=new int[501];
        for(int i:arr){
            freq[i]++;
        }
        int ans=-1;
        for(int i:arr){
            if(freq[i]==i && freq[i]>ans){
                ans=i;
            }
        }
        return ans;
    }
}