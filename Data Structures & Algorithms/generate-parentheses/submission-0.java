class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<String>();

        return helper(n - 1, n, "(", result);

    }

    private List<String> helper(int n, int m, String rsf, List<String> out) {

        if (n == 0 && m == 0) {
            out.add(rsf);
        } else if (n == 0) {
            helper(n, m - 1, rsf + ")", out);
        } else if (n <= m) {
            out.addAll(helper(n - 1, m, rsf + "(", new ArrayList<String>()));
            out.addAll(helper(n, m - 1, rsf + ")", new ArrayList<String>()));
        }

        return out;

    }

}
