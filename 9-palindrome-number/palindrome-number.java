class Solution {
    public boolean isPalindrome(int x) {
        int res=0;
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }
        while(x>res){
            res=res*10+x%10;
            x=x/10;
        }
        if(x==res || x==res/10)
        return true;
        else
        return false;
    }
}