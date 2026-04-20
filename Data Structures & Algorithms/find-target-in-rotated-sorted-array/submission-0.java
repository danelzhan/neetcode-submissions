class Solution {
    public int search(int[] nums, int target) {
        int pivot = getPivot(nums, nums.length - 1, 0);

        int result = rotatedBSearch(nums, target, pivot - 1, 0);

        if (result == -1) {
            return rotatedBSearch(nums, target, nums.length - 1, pivot);
        }

        return result;


    }

    public int getPivot(int[] nums, int top, int bot) {
        
        int mid = (top + bot) / 2;

        if (top == bot) {
            return mid;
        }

        if (nums[mid] < nums[top]) {

            return getPivot(nums, mid, bot);

        } else {
            return getPivot(nums, top, mid + 1);
        }

    }

    public int rotatedBSearch(int[] nums, int target, int top, int bot) {

        int mid = (top + bot) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (top < bot) {
            return -1;
        }

        if (nums[mid] > target) {
            return rotatedBSearch(nums, target, mid - 1, bot);
        } else {
            return rotatedBSearch(nums, target, top, mid + 1);
        }

    }

}
