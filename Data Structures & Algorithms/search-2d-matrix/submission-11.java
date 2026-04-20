class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        return search(matrix, target, matrix.length - 1, 0);

    }

    public boolean search(int[][] matrix, int target, int top, int bot) {

        int mid = (top + bot) / 2;

        if (bot > top) {
            return false;
        }

        if (target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length - 1]) {
            return bsearch(matrix[mid], target, matrix[mid].length - 1, 0);
        } else if (target < matrix[mid][0]) {
            return search(matrix, target, mid - 1, bot);
        } else {
            return search(matrix, target, top, mid + 1);
        }

    }

    public boolean bsearch(int[] mat, int target, int top, int bot) {
        int mid = (top + bot) / 2;

        if (bot > top) {
            return false;
        }
        
        if (mat[mid] == target) {
            return true;
        } else if (mat[mid] < target) {
            return bsearch(mat, target, top, mid + 1);
        } else if (mat[mid] > target) {
            return bsearch(mat, target, mid - 1, bot);
        }

        return false;

    }
}
