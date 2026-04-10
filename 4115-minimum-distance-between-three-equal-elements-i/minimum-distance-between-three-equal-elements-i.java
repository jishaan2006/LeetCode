class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
            for (int i=0;i<nums.length;i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i],new ArrayList<>());
                }
                map.get(nums[i]).add(i);
            }
            int min=Integer.MAX_VALUE;
            for(ArrayList<Integer> list:map.values()){
                if(list.size()<3) continue;
                for(int i=0;i<=list.size()-3;i++){
                    int dis=2*(list.get(i+2)-list.get(i));
                    min=Math.min(min,dis);
                }
            }

        return min==Integer.MAX_VALUE ? -1 : min;
    }
}