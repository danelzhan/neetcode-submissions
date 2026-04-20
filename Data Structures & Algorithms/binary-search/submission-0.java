class Solution {
    public int search(int[] nums, int target) {
        
        return binarySearch(nums, target, nums.length/2, 0, nums.length);
        
    }
    public int binarySearch(int[] nums, int target, int c, int f, int t) {
        
        if (nums[c] == target) {
            return c;
        }

        if (c <= f || c >= t) {
            return -1;
        }
        
        if (nums[c] > target) {
            return binarySearch(nums, target, (c + f)/2, f, c);
        } else {
            return binarySearch(nums, target, (c + t)/2, c, t);
        }

    }
}
