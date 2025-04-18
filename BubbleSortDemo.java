public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {732, 18, 645, 401, 983, 292, 177, 553, 806, 72, 395, 29, 951, 687, 120, 843, 378, 199, 3, 498,
            617, 928, 314, 752, 841, 266, 509, 738, 640, 336, 164, 442, 780, 886, 72, 131, 957, 23, 675, 591,
            360, 458, 409, 723, 133, 970, 50, 589, 262, 100, 8, 916, 802, 242, 769, 689, 504, 373, 99, 771,
            338, 104, 900, 210, 321, 812, 30, 999, 721, 628, 43, 15, 230, 877, 92, 411, 571, 638, 228, 814,
            97, 301, 61, 734, 320, 250, 123, 991, 604, 180, 56, 937, 314, 85, 744, 812, 370, 419, 285, 149};
        bubbleSort(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static void bubbleSort(int[] arr){
        long start = System.nanoTime()/1000;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        long end = System.nanoTime()/1000;
        System.out.println("Sorting done in "+(end-start)+" micros.");
    }
}
