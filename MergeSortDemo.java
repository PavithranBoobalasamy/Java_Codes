public class MergeSortDemo {
    public static void main(String[] args) {
        int[] arr = {732, 18, 645, 401, 983, 292, 177, 553, 806, 72, 395, 29, 951, 687, 120, 843, 378, 199, 3, 498,
            617, 928, 314, 752, 841, 266, 509, 738, 640, 336, 164, 442, 780, 886, 72, 131, 957, 23, 675, 591,
            360, 458, 409, 723, 133, 970, 50, 589, 262, 100, 8, 916, 802, 242, 769, 689, 504, 373, 99, 771,
            338, 104, 900, 210, 321, 812, 30, 999, 721, 628, 43, 15, 230, 877, 92, 411, 571, 638, 228, 814,
            97, 301, 61, 734, 320, 250, 123, 991, 604, 180, 56, 937, 314, 85, 744, 812, 370, 419, 285, 149};
        int n = arr.length;
            System.out.println("Array before sorting :");
        for(int num : arr){
            System.out.print(num+", ");
        }
        System.out.println();
        long start = System.nanoTime()/1000;
        mergeSort(arr,0,n-1);
        long end = System.nanoTime()/1000;
        System.out.println("Sorting done in "+(end-start)+" micros");
        System.out.println("Array after sorting :");
        for(int num : arr){
            System.out.print(num+", ");
        }
        System.out.println();
    }
    private static void mergeSort(int[] arr , int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr, l, mid, r);
        }
    }
    private static void merge(int[] arr, int l, int mid, int r) {
        int n = mid-l+1;
        int m = r-mid;
        int[] leftArray = new int[n];
        int[] rightArray = new int[m];
        for(int x=0;x<n;x++){
            leftArray[x] = arr[l+x];
        }
        for(int x=0;x<m;x++){
            rightArray[x] = arr[mid+1+x];
        }
        int i=0,j=0,k=l;
        while(i<n && j<m){
            if(leftArray[i]<=rightArray[j]){
                arr[k++] = leftArray[i++];
            }
            else{
                arr[k++] = rightArray[j++];
            }
        }
        while(i<n){
            arr[k++] = leftArray[i++];
        }
        while(j<m){
            arr[k++] = rightArray[j++];
        }
    }
}
