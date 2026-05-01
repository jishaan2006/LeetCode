class Solution {
    public String toLowerCase(String s) {
        StringBuilder sc = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sc.append((char) (ch + 32));
            } else {
                sc.append(ch);
            }

        }
        return sc.toString();
    }
}