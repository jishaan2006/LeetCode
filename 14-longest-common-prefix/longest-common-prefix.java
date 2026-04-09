class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder st = new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
        boolean flag=true;
            char ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(i>=strs[j].length() || ch!=strs[j].charAt(i)){
                    flag=false;
                }
            }
            if(flag==true){
                st.append(ch);
            }else{
                return st.toString();
            }
        }
        return st.toString();
    }
}