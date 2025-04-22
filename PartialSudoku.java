public class PartialSudoku {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValid(board));
    }
    public static boolean isValid(char[][] arr){
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                if(arr[i][j] == '.') continue;

                int num = arr[i][j] - '1';
                int boxIndex = (i/3) * 3 + (j/3);

                if(row[i][num] || col[j][num] || box[boxIndex][num]) return false;
                row[i][num] = true;
                col[j][num] = true; 
                box[boxIndex][num] = true;
            }
        }
        return true;
    }
}
