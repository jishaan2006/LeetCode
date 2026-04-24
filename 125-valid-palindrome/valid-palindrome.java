class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        int r=s.length()-1;
        int l=0;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))) return false;
            l++;
            r--;
        }
        return true;
    }
}