class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> rev = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) return false;
            } else {
                map.put(ch, word);
            }

            if (rev.containsKey(word)) {
                if (rev.get(word) != ch) return false;
            } else {
                rev.put(word, ch);
            }
        }

        return true;
    }
}