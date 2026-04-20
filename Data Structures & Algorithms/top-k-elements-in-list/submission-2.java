class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        ArrayList<Integer>[] array = new ArrayList[nums.length + 1];
        int[] result = new int[k];

        for (int i = 0; i < nums.length; i++) {

            if (frequency.get(nums[i]) == null) {
                frequency.put(nums[i], 1);
            } else {
                frequency.put(nums[i], frequency.get(nums[i]) + 1);
            }

        }

        for (int i = 0; i < array.length; i++) {
            array[i] = new ArrayList<Integer>();
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {

            array[entry.getValue()].add(entry.getKey());

        }
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int value : array[i]) {
                result[j] = value;
                if (j + 1 == k) {
                    return result;
                }
                j++;
            }
        }
        return null;

    }
}
