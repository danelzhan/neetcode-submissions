class Solution {
    public int search(int[] nums, int target) {
        
        return helper(nums, target, nums.length - 1, 0);

    }

    private int helper(int[] nums, int target, int top, int bot) {

        int mid = (top + bot) / 2;

        if (nums[mid] == target) return mid;

        if (top < bot) return -1;

        if (nums[mid] < target) return helper(nums, target, top,  1 + mid);

        if (nums[mid] > target) return helper(nums, target, mid - 1, bot);

        return -1;


    }
}
