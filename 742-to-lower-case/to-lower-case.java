class Solution {
    public String toLowerCase(String s) {
        StringBuilder sc=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' ||ch<='Z'){
                sc.append(Character.toLowerCase(ch));
            }else{
                sc.append(ch);
            }

        }
        return sc.toString();
    }
}