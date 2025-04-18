public class SelectionSortDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = {73, 12, 87, 45, 29, 91, 3, 67, 10, 38, 56, 22, 94, 8, 49, 66, 15, 81, 27, 60, 35, 2, 77, 50, 6, 99, 31, 18, 84, 26, 40, 95, 19, 5, 90, 72, 33, 13, 59, 76, 4, 92, 63, 21, 97, 1, 46, 30, 70, 88};
        selectionSort(arr);

        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
        long end = System.currentTimeMillis();
        System.out.println("Done in :" + (end-start)+" millies.");
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j; 
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}