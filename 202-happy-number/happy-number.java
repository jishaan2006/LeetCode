class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n != 1){
            if(set.contains(n)) return false;
            set.add(n);
            n=sumSquare(n);
        }
        return true;
    }
    static int sumSquare(int n){
        int res=0;
        while(n>0){
            res+= (n%10)*(n%10);
            n=n/10;
        }
        return res;
    }
}