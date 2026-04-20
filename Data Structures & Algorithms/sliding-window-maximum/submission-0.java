class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int i = 0;
        int j = k - 1;
        int[] result = new int[nums.length - k + 1];

        while (j < nums.length) {
            int max = -1001;
            for (int l = i; l <= j; l++) {
                if (nums[l] > max) {
                    max = nums[l];
                }
                result[i] = max;
            }

            i++;
            j++;
        }
        return result;
        
    }
}
