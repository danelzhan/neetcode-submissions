class Solution {

    public String encode(List<String> strs) {
        String code = "";

        for (String str : strs) {
            code += str.length();
            code += '#';
            code += str;
        }

        return code;

    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<String>();
        System.out.println(str);
        int j = 0;
        String length;
        for (int i = 0; i < str.length(); i++) {
            length = "";
            while (str.charAt(i) != '#') {
                length += str.charAt(i);
                i++;
            }
            System.out.println(length);
            j = Integer.parseInt(length);
            i++;
            strs.add(str.substring(i, i + j));
            i += j - 1;
        }

        return strs;

    }
}
