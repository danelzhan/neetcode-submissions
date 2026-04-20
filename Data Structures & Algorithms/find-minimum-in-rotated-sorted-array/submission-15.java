class Solution {
    public int findMin(int[] nums) {
        
        int i = 0;
        int left = 0;
        int right = nums.length - 1;

        return search(nums, left, right, nums[left]);

    }

    public int search(int[] nums, int left, int right, int first) {
        
        int mid = (left + right) / 2;


        if (left == right) {
            return nums[mid];
        }

        if (nums[mid] > nums[right]) {
            return search(nums, mid + 1, right, first);
        } else {
            return search(nums, left, mid, first);
        }

    }



}
