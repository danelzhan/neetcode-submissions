class Solution {
    public int findDuplicate(int[] nums) {

        int i = 0;
        int j = 1;

        while (true) {

            
            if (i != j && nums[i] == nums[j]) {
                return nums[i];
            }

            if (i != j) {
                i = (i + 1) % (nums.length);
                j = (j + 2) % (nums.length);
            } else {
                j = (j + 1) % (nums.length);
            }

        }

    }
}
