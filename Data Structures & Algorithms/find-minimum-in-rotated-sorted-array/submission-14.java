class Solution {
    public int findMin(int[] nums) {
        return binarySearch(nums, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int left, int right) {
        // Base case: only one element left
        if (left == right) {
            return nums[left];
        }

        int mid = (left + right) / 2;

        // If middle element > rightmost, min is in right half
        if (nums[mid] > nums[right]) {
            return binarySearch(nums, mid + 1, right);
        } else {
            // Min is in left half (including mid)
            return binarySearch(nums, left, mid);
        }
    }
}
