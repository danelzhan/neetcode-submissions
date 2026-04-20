class Solution {
    public int maxArea(int[] heights) {
        int max = 0;

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length; j++) {
                if (Math.min(heights[i], heights[j]) * (j - i) > max) {
                    max = Math.min(heights[i], heights[j]) * (j - i);
                }
            }
        }
        
        return max;

    }
}
