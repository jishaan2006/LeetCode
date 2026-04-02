class Solution {
    public int maxArea(int[] height) {
        int maxWater=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int curr;
            curr=Math.min(height[l],height[r])*(r-l);
            if(curr>maxWater){
                maxWater=curr;
            }
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxWater;
    
    }
}