public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,7};
        int xor = 0;
        for(int num : nums) xor^=num;
        System.out.println(xor);
    }
}
