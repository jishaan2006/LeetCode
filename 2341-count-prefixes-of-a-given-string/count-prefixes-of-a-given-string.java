class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String ss=words[i];
            if(s.startsWith(ss)){
                count++;
            }
        }
        return count;
    }
}