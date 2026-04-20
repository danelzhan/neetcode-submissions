class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<Integer, Integer>();
        int[] result = {0, 0};

        for (int i = 0; i < nums.length; i++) {

            if (seen.containsKey(target - nums[i])) {
                result[0] = seen.get(target - nums[i]);
                result[1] = i;
            } else {
                seen.put(nums[i], i);
            }

        }

        return result;

    }
}
