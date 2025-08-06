import java.util.Arrays;

public class Fruits3 {
    public static void main(String[] args) {
        int[] fruits = {4,2,5};
        int[] baskets = {3,4,5};
        int n = numOfUnplacedFruits(fruits,baskets);
        System.out.println(n);
    }
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        Arrays.sort(fruits);
        Arrays.sort(baskets);
        int i=fruits.length-1;
        for(int j=baskets.length-1;j>=0;j--){
            if(baskets[j]>=fruits[i]){
                System.out.println("j:"+baskets[j]+" i:"+fruits[i]);
                --i;
            }
        }
        return i+1;
    }
}
