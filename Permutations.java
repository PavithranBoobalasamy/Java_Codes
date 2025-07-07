
import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        boolean[] used = new boolean[arr.length];
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(arr,used,current,result);
        System.out.println(result);
    }
    private static void backtrack(int[] arr,boolean[] used, List<Integer> current, List<List<Integer>> result){
        if(current.size() == arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0 ; i<arr.length ;i++){
            if(used[i]) continue;
            current.add(arr[i]);
            used[i] = true;
            backtrack(arr,used,current,result);
            current.remove(current.size() -1);
            used[i] = false;
        }
    }
}
