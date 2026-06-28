class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        char[] arr=s.toCharArray();
        int left=0;

        int longest_length=0;
        for(int right=0;right<s.length();right++){

            freq[arr[right]-'A']++;

            int max_freq=0;
            for(int i:freq){
                max_freq=Math.max(max_freq,i);
            }

            while((right-left+1)-max_freq>k){
                freq[arr[left]-'A']--;
                left++;

                max_freq=0;
                for(int i:freq){
                    max_freq=Math.max(max_freq,i);
                }
            }
            longest_length=Math.max(right-left+1,longest_length);

        }
        return longest_length;
    }
}