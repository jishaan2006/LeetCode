class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        while(l<r){
            while(l<r && "aeiouAEIOU".indexOf(s.charAt(l))==-1) l++;
            while(l<r && "aeiouAEIOU".indexOf(s.charAt(r))==-1) r--;
            char ch=sb.charAt(l);
            sb.setCharAt(l,sb.charAt(r));
            sb.setCharAt(r,ch);
            l++;
            r--;

        }
        return sb.toString();
    }
}