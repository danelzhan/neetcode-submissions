class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        boolean bothValid = true;

        int j = s.length() - 1;
        int i = 0;
        while (i < j) {
            bothValid = true;
            if (!((s.charAt(i) >= 65 && s.charAt(i) <= 90)
                || (s.charAt(i) >= 97 && s.charAt(i) <= 122)
                || (s.charAt(i) >= 48 && s.charAt(i) <= 57))) {
                    i++;
                    bothValid = false;
                }

            if (!((s.charAt(j) >= 65 && s.charAt(j) <= 90)
                || (s.charAt(j) >= 97 && s.charAt(j) <= 122)
                || (s.charAt(j) >= 48 && s.charAt(j) <= 57))) {
                    j--;
                    bothValid = false;
                }
            if (bothValid && s.charAt(i) != s.charAt(j)) {
                return false;
            } else if (bothValid) {
                i++;
                j--;
            }

        }

        return true;
    }
}
