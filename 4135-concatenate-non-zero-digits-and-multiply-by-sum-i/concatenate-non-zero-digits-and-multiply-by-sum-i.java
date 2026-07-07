class Solution {
    public long sumAndMultiply(int n) {
        long rev = 0;
        long temp = n;
        long sum=0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        long x = 0;
        while (rev > 0) {
            long ld = rev % 10;
            if (ld != 0) {
                sum+=ld;
                x = x * 10 + ld;
            }
            rev /= 10;
        }
        return x * sum;
    }
}