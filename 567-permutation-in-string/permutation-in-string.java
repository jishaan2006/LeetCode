class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int k = s1.length();

        if (k > s2.length()) {
            return false;
        }

        int[] freq_s1 = new int[26];
        int[] freq_s2 = new int[26];

        for (int i = 0; i < k; i++) {
            char c = s1.charAt(i);
            freq_s1[c - 'a']++;
        }


        for (int i = 0; i < k; i++) {
            char c = s2.charAt(i);
            freq_s2[c - 'a']++;
        }

        if(Arrays.equals(freq_s1,freq_s2)){
            return true;
        }

        for(int i=k;i<s2.length();i++){
            char newchar=s2.charAt(i);
            freq_s2[newchar -'a']++;
            char oldchar=s2.charAt(i-k);
            freq_s2[oldchar-'a']--;

            if(Arrays.equals(freq_s1,freq_s2)){
                return true;
            }
        }
        return false;
    }
}