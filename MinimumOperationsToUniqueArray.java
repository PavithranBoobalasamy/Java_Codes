import java.util.HashSet;

public class MinimumOperationsToUniqueArray {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9};
        int result = getResult(arr);
        result=(result+2)/3;
        System.out.println(result);
    }
    public static int getResult(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=arr.length-1;i>=0;i--){
            if(set.contains(arr[i])){
                return i+1;
            }
            else{
                set.add(arr[i]);
            }
        }
        return 0;
    }
}
