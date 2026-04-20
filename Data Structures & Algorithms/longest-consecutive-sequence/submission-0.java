class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> visited = new HashSet<Integer>();
        int length = 1;
        int max_length = 0;

        for (int i = 0; i < nums.length; i++) {
            visited.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int current_num = nums[i];
            while (visited.contains(current_num + 1)) {
                length++;
                current_num++;
            }
            if (length > max_length) {
                max_length = length;
            }
            length = 1;
        }

        return max_length;

    }
}
