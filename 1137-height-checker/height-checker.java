class Solution {
    public int heightChecker(int[] heights) {
        int c = 0;
        int[] freq = new int[101];
        for (int n : heights) {
            freq[n]++;
        }
        int curr_height = 1;

        for (int i = 0; i < heights.length; i++) {
            while (freq[curr_height] == 0) curr_height++;
            if (heights[i] != curr_height) {
                c++;
            }
            freq[curr_height]--;
        }
        return c;
    }
}