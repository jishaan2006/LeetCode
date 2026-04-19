class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        StringBuilder sc=new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sc.append(Character.toLowerCase(c));
            }
        }
        StringBuilder st=new StringBuilder(sc);
        st.reverse();
        if(st.toString().equals(sc.toString())) return true;
        return false;
    }
}