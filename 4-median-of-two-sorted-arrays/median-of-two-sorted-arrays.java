class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] arr=new int[n];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(j< nums1.length && (k>= nums2.length  || nums1[j]<nums2[k])){
                arr[i]=nums1[j++];
            }else{
                arr[i]=nums2[k++];
            }
        }
        if(n%2==0){
            return (arr[n/2]+arr[n/2-1])/2.0;
        }
        else{
            return arr[n/2];
        }
    }
}