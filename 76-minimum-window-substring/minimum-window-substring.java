class Solution {
    public String minWindow(String s, String t) {
        int[] freq=new int[128];
        int[] need=new int[128];
        int required=0;
        for (int i = 0; i < t.length(); i++) {
            char c=t.charAt(i);
            if (need[c] == 0)
                required++;
            need[c]++;
        }
        int min=Integer.MAX_VALUE;
        int formed=0;
        int left=0;
        int l=0;
        int r=0;
        for (int right = 0; right <s.length() ; right++) {
            char c=s.charAt(right);
            freq[c]++;
            if(freq[c]==need[c]){
                formed++;
            }
            while(formed==required){
                char left_char=s.charAt(left);
                int len = right - left + 1;
                if(len < min){
                    min = len;
                    l = left;
                    r = right;
                }
                freq[left_char]--;
                if(freq[left_char]<need[left_char]){
                    formed--;
                }
                left++;
            }
        }
        if (min == Integer.MAX_VALUE)
            return "";
        return s.substring(l,r+1);
    }
}