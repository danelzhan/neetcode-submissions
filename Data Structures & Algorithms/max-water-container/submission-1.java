class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int i = 0;
        int j = heights.length - 1;

        while (i < j) {
            int min = Math.min(heights[i], heights[j]);
            if (min * (j - i) > max) {
                max = min * (j - i);
            }

            if (min == heights[i]) {
                i++;
            } else if (min == heights[j]) {
                j--;
            }

        }

        return max;

    }
}
