import java.util.Arrays;
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 3, 9, 21, 4, 8, 11, 2, 19, 6, 13, 1, 10};
        Arrays.sort(arr);
        int target = 28;
        int result = BinarySearch(arr,target);
        if(result != -1) System.out.println("Target found at the index :"+result);
        else{
            System.out.println("Target not found at the array");
        }
    }
    public static int BinarySearch(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}