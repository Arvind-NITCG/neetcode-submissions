class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] coloumn = new boolean[9][9];
        boolean[][] boxes  = new boolean[9][9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if (board[i][j] == '.') continue;
                int val = board[i][j] - '1';
                int boxindex = (i/3)*3+(j/3);
                if(rows[i][val] || coloumn[j][val] || boxes[boxindex][val]) return false;

                rows[i][val] = true;
                coloumn[j][val] = true;
                boxes[boxindex][val] = true;
            }
        }
        return true;
    }
}

