class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        int[][] freq=new int[words.length][26];
        for (int i = 0; i < words.length; i++) {
            String ch = words[i];
            for (int j = 0; j < ch.length(); j++) {
                char c = ch.charAt(j);
                int index = c - 'a';
                freq[i][index]++;
            }
        }
        for(int i=0;i< words[0].length();i++) {
            boolean present=true;
            char ch = words[0].charAt(i);
            for (int j = 0; j < words.length; j++) {
                if (freq[j][ch - 'a'] == 0) {
                    present = false;
                    break;
                }
            }
            if(present){
                for(int j=0;j<words.length;j++){
                    freq[j][ch-'a']--;
                }
                list.add(Character.toString(ch));
            }
        }
        return list;
    }
}