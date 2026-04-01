class Solution {
    public int reverse(int x) {
        int res=0;
        int num=Math.abs(x);
        int lastdigit=0;
        
        while(num>0){
        lastdigit=num%10;
        if(res>(Integer.MAX_VALUE -lastdigit)/10){
            return 0;
        }
           res=res*10+lastdigit;
           num=num/10;
        }
        return (x< 0) ?  (-res) : res;
    }
}