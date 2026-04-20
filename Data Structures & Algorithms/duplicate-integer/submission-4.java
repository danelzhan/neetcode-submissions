class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (seen.get(nums[i]) != null) {
                return true;
            }

            seen.put(nums[i], i);

        }

        return false;


    }
}
