public class LinearSearchDemo{
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 3, 9, 21, 4, 8, 11, 2, 19, 6, 13, 1, 10};
        int target = 28;
        int result = LinearSearch(arr,target);
        if (result!=-1) System.out.println("Target element is at the index :"+result);
        else {
            System.out.println("Target not found in the array");
        }
    }
    public static int LinearSearch(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}