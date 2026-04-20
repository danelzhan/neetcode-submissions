class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else if (stack.size() > 0) {
                if (c == ')') {
                    if (stack.get(stack.size() - 1) == '(') {
                        stack.remove(stack.size() - 1);
                        continue;
                    } else {
                        return false;
                    }
                } else if (c == '}') {
                    if (stack.get(stack.size() - 1) == '{') {
                        stack.remove(stack.size() - 1);
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    if (stack.get(stack.size() - 1) == '[') {
                        stack.remove(stack.size() - 1);
                        continue;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }

        return stack.size() == 0;

    }
}
