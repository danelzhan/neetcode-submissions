class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Boolean> rows = new HashMap<Character, Boolean>();
        HashMap<Character, Boolean> cols = new HashMap<Character, Boolean>();
        HashMap<Character, Boolean> sqrs= new HashMap<Character, Boolean>();
        
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {

                if (rows.get(board[i][j]) != null) {
                    return false;
                }
                if (cols.get(board[j][i]) != null) {
                    return false;
                }

                if (board[i][j] != '.') {
                    rows.put(board[i][j], true);
                }
                if (board[j][i] != '.') {
                    cols.put(board[j][i], true);
                }

            }
            rows.clear();
            cols.clear();

        }

        for (int i = 1; i < board.length; i += 3) {
            for (int j = 1; j < board.length; j += 3) {
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (sqrs.get(board[k][l]) != null) {
                            return false;
                        }
                        if (board[k][l] != '.') {
                            sqrs.put(board[k][l], true);
                        }
                    }
                }
                sqrs.clear();
            }
        }

        return true;

    }
}
