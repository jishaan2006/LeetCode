class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(int i=0;i< words.length;i++){
            if(words[i].length()>s.length()){
                continue;
            }
            int k=0;
            while(k< words[i].length() && s.charAt(k)==words[i].charAt(k)){
                k++;
            }
            if(k== words[i].length()){
                c++;
            }
        }
        return c;
    }
}