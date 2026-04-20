class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i = 0;
        int j = i + s1.length() - 1;
        int[] map = new int[26];
        int[] count = new int[26];
        boolean valid = true;

        for (int k = 0; k < s1.length(); k++) {
            map[s1.charAt(k) - 97] += 1;
        }

        while (j < s2.length()) {
            for (int k = i; k <= j; k++) {
                char c = s2.charAt(k);
                count[c - 97] += 1;
            }
            for (int k = 0; k < map.length; k++) {
                if (map[k] != count[k]) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                return true;
            }
            valid = true;
            count = new int[26];
            j++;
            i++;
        }
        return false;

    }
}
