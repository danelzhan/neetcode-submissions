class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> seen = new HashSet<Character>();

        int i = 0;
        int j = 0;
        int max = 0;

        while (j < s.length()) {

            char c = s.charAt(j);

            if (seen.contains(c)) {
                seen.remove(s.charAt(i));
                i++;
            } else {
                seen.add(s.charAt(j));
                if (j - i + 1 > max) max = j - i + 1;
                j++;
            }

        }

        return max;

    }
}
