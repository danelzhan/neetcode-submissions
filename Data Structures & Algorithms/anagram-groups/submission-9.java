class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<List<String>>();
        
        for (int i = 0; i < strs.length; i++) {
            boolean is = false;
            for (int j = 0; j < anagrams.size(); j++) {
                if (isAnagram(anagrams.get(j).get(0), strs[i])) {
                    anagrams.get(j).add(strs[i]);
                    is = true;
                    break;
                }
            }
            if (!is) {
                ArrayList<String> newAnagram = new ArrayList<String>();
                newAnagram.add(strs[i]);
                anagrams.add(newAnagram);
            }
        }
        return anagrams;

    }

	public static boolean isAnagram (String s1, String s2) {

        boolean is = false;

        if (s1.equals(s2)) {
            return true;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    s2 = s2.substring(0, j) + s2.substring(j + 1, s2.length());
                    System.out.println(s2);
                    is = true;
                    break;
                }
                is = false;
            }
            if (!is) return is;
        }
        return is;

    }

}
