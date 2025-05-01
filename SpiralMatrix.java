import java.util.ArrayList;
import java.util.List;
public class SpiralMatrix{
    public static void main(String[] args){
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        List<Integer> list = spiralMatrix(arr);
        System.out.println(list);
    }
    private static List<Integer> spiralMatrix(int[][] arr){
        List<Integer> list = new ArrayList<>();
        int left = 0, top = 0;
        int bottom = arr.length-1;
        int right = arr[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}