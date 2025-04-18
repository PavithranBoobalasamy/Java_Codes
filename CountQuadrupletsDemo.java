
import java.util.Arrays;

public class CountQuadrupletsDemo{
    public static void main(String[] args) {
        int[] arr = {2,16,9,27,3,39};
        int result = countQuadruplets(arr);
        System.out.println(result);
    }
    public static int countQuadruplets(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for(int i =0;i<n-3;i++){
            for(int j = i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    int sIndex = Arrays.binarySearch(nums,k+1,n,sum);
                    if(sIndex>k){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}