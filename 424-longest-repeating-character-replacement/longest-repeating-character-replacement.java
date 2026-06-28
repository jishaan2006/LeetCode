class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        char[] arr = s.toCharArray();
        int left = 0;

        int longest_length = 0;
        int max_freq=0;
        for (int right = 0; right < s.length(); right++) {

            freq[arr[right] - 'A']++;

            max_freq = Math.max(max_freq, freq[arr[right] - 'A']);

            while ((right - left + 1) - max_freq > k) {
                freq[arr[left] - 'A']--;
                left++;
            }

            longest_length = Math.max(longest_length, right - left + 1);
        }
        return longest_length;
    }
}