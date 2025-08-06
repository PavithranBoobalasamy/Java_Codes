import java.util.Arrays;

public class OddEvenSort {
    public static void main(String[] args) {
        int[] nums = {13, 4, 7, 2, 9, 10, 5, 8, 1, 6};
        int oddInd = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                int temp = nums[i];
                nums[i] =nums[oddInd];
                nums[oddInd] = temp;
                oddInd++;
            }
        }
        Arrays.sort(nums,0,oddInd);
        reverse(nums,0,oddInd-1);
        Arrays.sort(nums,oddInd,nums.length);
        System.out.println(Arrays.toString(nums));
    }
    private static void reverse(int[] nums,int l,int r){
        while(l<=r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
