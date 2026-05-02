class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
        HashSet<Character> set3=new HashSet<>();

        String a="qwertyuiopQWERTYUIOP";
        String b="asdfghjklASDFGHJKL";
        String c="ZXCVBNMzxcvbnm";

        ArrayList<String> ans = new ArrayList<>();

        for(char o:a.toCharArray()){
            set1.add(o);
        }
        for(char o:b.toCharArray()){
            set2.add(o);
        }
        for(char o:c.toCharArray()){
            set3.add(o);
        }

        for(int i=0;i<words.length;i++){
            String s=words[i];
            int c1=0,c2=0,c3=0;
            for(int j=0;j<s.length();j++){
                if(set1.contains(s.charAt(j))){
                    c1++;
                }
                if(set2.contains(s.charAt(j))){
                    c2++;
                }
                if(set3.contains(s.charAt(j))){
                    c3++;
                }
                if(c1==s.length()||c2==s.length()||c3==s.length()){
                    ans.add(s);
                }
            }
        }
        return ans.toArray(new String[0]);
    }
}