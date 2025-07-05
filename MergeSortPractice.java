public class MergeSortPractice{
    public static void main(String[] args) {
        int[] arr = {42, 17, 8, 91, 3, 76, 23, 54, 10, 65, 1, 89, 33, 7, 29, 50, 68, 12, 99, 6, 37, 81, 21, 90, 11, 44, 31, 58, 72, 2, 80, 14, 93, 24, 9, 60, 100, 5, 26, 18, 77, 20, 84, 39, 13, 27, 61, 4, 97, 70, 36, 28, 15, 95, 86, 19, 32, 35, 25, 38};
        System.out.println("Before Sorting");
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
        long start = System.nanoTime();
        mergeSort(arr, 0, arr.length-1);
        long end = System.nanoTime();
        System.out.println("Sorted in :"+ (end - start)/1000 + "milliSeconds");
        System.out.println("After Sorting");
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr,int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public static void merge(int[] arr,int l, int mid, int r){
        int n = mid-l+1;
        int m = r - mid;
        int[] leftA = new int[n];
        int[] rightA = new int[m];
        for(int x =0; x<n;x++){
            leftA[x] = arr[x+l];
        }
        for(int x =0; x<m;x++){
            rightA[x] = arr[mid+x+1];
        }
        int x = 0,y=0,k=l;
        while(x<n && y<m){
            if(leftA[x] <= rightA[y]){
                arr[k++] = leftA[x++];
            }
            else{
                arr[k++] = rightA[y++];
            }
        }
        while(x<n){
            arr[k++] = leftA[x++];
        }
        while(y<m){
            arr[k++] = rightA[y++];
        }
    }
}