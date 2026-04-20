class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int vol = 0;
        int left = 0;
        int right = 0;

        while (i <= j) {
            if (left <= right) {
                int holder = left - height[i];
                System.out.println(holder);
                if (holder > 0) {
                    vol += holder;
                }
                if (height[i] > left) {
                    left = height[i];
                }
                i++;
                
            } else {
                int holder = right - height[j];
                System.out.println(holder);
                if (holder > 0) {
                    vol += holder;
                }
                if (height[j] > right) {
                    right = height[j];
                }
                j--;
            }
        }

        return vol;

    }
}
