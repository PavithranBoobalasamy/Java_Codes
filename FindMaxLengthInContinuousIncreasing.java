import java.util.PriorityQueue;

public class FindMaxLengthInContinuousIncreasing {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int result = getResult(nums);
        System.out.println(result);
    }
    public static int getResult(int[] nums) {
        if (nums.length == 0) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
        }
        int len = 1, maxLen = 1;
        int prev = pq.poll();
        while (!pq.isEmpty()) {
            int curr = pq.poll();
            if (curr == prev) continue;
            if (curr == prev + 1) {
                len++;
                maxLen = Math.max(maxLen, len);
            } else {
                len = 1;
            }
            prev = curr;
        }
        return maxLen;
    }
}
