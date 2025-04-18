import java.util.ArrayList;
import java.util.List;

public class TraversingAllSubSetsInArray {
    public static void main(String[] args) {
        int arr[] = {3,1,4,2};
        int n = arr.length;

        int totalSubsets = 1 << n; 
        ArrayList<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(arr[j]);
                }
            }
            list.add(subset);
        }
        System.out.println(list);
    }
}
