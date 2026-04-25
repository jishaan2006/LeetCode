class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        int n= arr.length;
        if(arr.length<3) return false;
        while (i + 1 < n && arr[i + 1] > arr[i]) {
            i++;
        }
        if(i==0 || i==arr.length-1) return false;
        while(i + 1 < n && arr[i + 1] < arr[i]){
            i++;
        }
        return i== arr.length-1;
    }
}