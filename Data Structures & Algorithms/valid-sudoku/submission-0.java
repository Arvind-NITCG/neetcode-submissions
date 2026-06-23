class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0;row<9;row++){
            HashSet<Character> seen = new HashSet<>();
            for(int i = 0; i < 9;i++){
                if(board[row][i]=='.') continue;
                if(seen.contains(board[row][i])) return false;
                seen.add(board[row][i]);
            }
        }
        for(int coloumn = 0; coloumn < 9; coloumn++){
            HashSet<Character> seen = new HashSet<>();
            for(int i = 0; i < 9; i++){
                if(board[i][coloumn]=='.') continue;
                if(seen.contains(board[i][coloumn])) return false;
                seen.add(board[i][coloumn]);
            }
        }
        for(int square = 0; square < 9; square++){
            HashSet<Character> seen = new HashSet<>();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    int row = (square/3)*3+i;
                    int col = (square%3)*3+j;
                    if(board[row][col]=='.')continue;
                    if(seen.contains(board[row][col])) return false;

                    seen.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
