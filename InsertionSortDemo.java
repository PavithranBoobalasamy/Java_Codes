public class InsertionSortDemo{
    public static void main(String[] args) {
        
        int[] arr = {732, 18, 645, 401, 983, 292, 177, 553, 806, 72, 395, 29, 951, 687, 120, 843, 378, 199, 3, 498,
            617, 928, 314, 752, 841, 266, 509, 738, 640, 336, 164, 442, 780, 886, 72, 131, 957, 23, 675, 591,
            360, 458, 409, 723, 133, 970, 50, 589, 262, 100, 8, 916, 802, 242, 769, 689, 504, 373, 99, 771,
            338, 104, 900, 210, 321, 812, 30, 999, 721, 628, 43, 15, 230, 877, 92, 411, 571, 638, 228, 814,
            97, 301, 61, 734, 320, 250, 123, 991, 604, 180, 56, 937, 314, 85, 744, 812, 370, 419, 285, 149};
        System.out.println("Array before sorting :");
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println();
        insertionSort(arr);
        System.out.println();
        System.out.println("Array after sorting :");
        for(int num : arr){
            System.out.print(num+" ");
        }
        
    }
    private static void insertionSort(int[] arr){
        long start = System.nanoTime()/1000;
        int n = arr.length;
        for(int i = 1; i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        long end = System.nanoTime()/1000;
        System.out.println("Sorting done in :" + (end-start)+" micros.");
    }
}