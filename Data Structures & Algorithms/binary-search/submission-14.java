class Solution {
    public int search(int[] nums, int target) {
        return bsearch(nums, target, nums.length - 1, 0);
    }

    public int bsearch(int[] mat, int target, int top, int bot) {   
        int mid = bot + (top - bot) / 2;

        if (bot > top) {
            return -1;
        }

        if (mat[mid] == target) {
            return mid;
        }
        
        if (mat[mid] < target) {
            return bsearch(mat, target, top, mid + 1);
        } else if (mat[mid] > target) {
            return bsearch(mat, target, mid - 1, bot);
        }

        return -1;

    }

}
