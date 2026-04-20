class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<int[]> stack = new Stack<int[]>();
        int max = 0;

        int[] first = {0, heights[0]};
        stack.add(first);
        for (int i = 1; i < heights.length; i++) {

            if (heights[i] <= stack.peek()[1]) {
                int[] e = {0, 0};
                while (!stack.empty() && heights[i] <= stack.peek()[1]) {
                    int[] prev = stack.pop();
                    int area = prev[1] * (i - prev[0]);
                    while (area > max) {
                        max = area;
                        System.out.println(max);
                        System.out.println(i);
                    }
                    int[] entry = {prev[0], heights[i]};
                    e = entry;
                }
                stack.add(e);
            } else {
                int[] entry = {i, heights[i]};
                stack.add(entry);
            }

        }

        while(!stack.empty()) {
            int[] prev = stack.pop();
            System.out.println(Arrays.toString(prev));
            int area = prev[1] * (heights.length - prev[0]);
            if (area > max) {
                max = area;
            }
        }

        return max;

    }
}
