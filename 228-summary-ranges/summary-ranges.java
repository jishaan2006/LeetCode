class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int start=nums[i];
            while(i<nums.length-1 && nums[i]+1==nums[i+1] ){
                i++;
            }
            int end=nums[i];
            if(end==start){
                l.add(start+"");
            }else{
                l.add(start+"->"+end);
            }
            i++;
        }
        return l;
    }
}