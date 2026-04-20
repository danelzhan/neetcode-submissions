class Solution {
    public boolean isAnagram(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        if (S.length != T.length) {
            return false;
        }
        for (int i = 0; i < S.length; i++) {
            for (int j = 0; j < T.length; j++) {
                if (S[i] == T[j]) {
                    T[j] = '0';
                    break;
                }
            }
        }
        for (int i = 0; i < T.length; i++) {
            if (T[i] != '0') {
                return false;
            }
        }
        return true;
    }
}
