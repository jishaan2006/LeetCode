class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< arr.length;i++){
            if(i>0){
                sb.append(" ");
            }
            for(int j=arr[i].length()-1;j>=0;j--){
                sb.append(arr[i].charAt(j));
            }
        }
        return sb.toString();
    }
}