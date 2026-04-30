class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c)){
                count++;
            }
        }
        if(word.length() == count){ return true;}
        if(count == 0){ return true;}
        if( (count == 1) && (word.charAt(0)>='A' && word.charAt(0)<='Z')  ){ return true; }

        return false;
    }
}