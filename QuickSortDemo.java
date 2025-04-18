
import java.util.Arrays;

public class QuickSortDemo{
    public static void main(String[] args) {
        int[] arr = {732, 18, 645, 401, 983, 292, 177, 553, 806, 72, 395, 29, 951, 687, 120, 843, 378, 199, 3, 498,
            617, 928, 314, 752, 841, 266, 509, 738, 640, 336, 164, 442, 780, 886, 72, 131, 957, 23, 675, 591,
            360, 458, 409, 723, 133, 970, 50, 589, 262, 100, 8, 916, 802, 242, 769, 689, 504, 373, 99, 771,
            338, 104, 900, 210, 321, 812, 30, 999, 721, 628, 43, 15, 230, 877, 92, 411, 571, 638, 228, 814,
            97, 301, 61, 734, 320, 250, 123, 991, 604, 180, 56, 937, 314, 85, 744, 812, 370, 419, 285, 149};
        int n = arr.length;
        System.out.println("Array before sorting :");
        System.out.println(Arrays.toString(arr));
        long start = System.nanoTime()/1000;
        quickSort(arr,0,n-1);
        long end = System.nanoTime()/1000;
        System.out.println("Array after sorting :");
        System.out.println(Arrays.toString(arr));

        System.out.println("Sorting done in "+ (end-start) +" micros");
    }
    private static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    private static int partition(int[] arr,int low,int high){
        int i=low-1;
        int pi = high;
        for(int j=low;j<high;j++){
            if(arr[j]<arr[pi]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[pi];
        arr[pi] = temp;

        return i+1;
    }
}