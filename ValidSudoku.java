import java.util.HashSet;

public class ValidSudoku{
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','4','6','7','8','9','1','2'},
            {'6','7','2','1','9','5','3','4','8'},
            {'1','9','8','3','4','2','5','6','7'},
            {'8','5','9','7','6','1','4','2','3'},
            {'4','2','6','8','5','3','7','9','1'},
            {'7','1','3','9','2','4','8','5','6'},
            {'9','6','1','5','3','7','2','8','4'},
            {'2','8','7','4','1','9','6','3','5'},
            {'3','4','5','2','8','6','1','7','9'}
        };
        System.out.println(isValid(board));
    }
    public static boolean isValid(char[][] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=1;i<=9;i++){
            set.add(i);
        }
        for(int i=0;i<9;i++){
            HashSet<Integer> rowSet = new HashSet<>();
            HashSet<Integer> colSet = new HashSet<>();
            for(int j=0;j<9;j++){
                rowSet.add(arr[i][j] - '0');
                colSet.add(arr[j][i] - '0');
            }
            if(!rowSet.equals(set) || !colSet.equals(set)) return false;
        }
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                HashSet<Integer> boxSet = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        boxSet.add(arr[i][j] - '0');
                    }
                }
                if (!boxSet.equals(set)) {
                    return false;
                }
            }
        }
        return true;
    }
}