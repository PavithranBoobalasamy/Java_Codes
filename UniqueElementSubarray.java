import java.util.HashSet;
import java.util.Set;
public class UniqueElementSubarray{
    public static void main(String[] args) {
        int[] nums = {4,2,4,5,6};
        int n = getLength(nums);
        System.out.println(n);
    }
    private static int getLength(int[] nums){
        Set<Integer> set = new HashSet<>();
        int maxSum = 0, currSum = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            while (set.contains(nums[end])) {
                currSum -= nums[start];
                set.remove(nums[start++]);
            }
            set.add(nums[end]);
            currSum += nums[end];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}