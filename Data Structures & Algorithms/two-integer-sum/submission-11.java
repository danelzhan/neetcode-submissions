class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
        int[] indicies = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (values.get(target - nums[i]) != null) {
                indicies[0] = values.get(target - nums[i]);
                indicies[1] = i;
                break;
            }

            values.put(nums[i], i);

        }

        return indicies;

    }
}
