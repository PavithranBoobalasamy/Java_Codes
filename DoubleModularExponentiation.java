import java.util.*;
import java.math.BigInteger;
public class DoubleModularExponentiation {
    public static void main(String[] args) {
        int[][] var = new int[][]{ {2,3,3,10},{3,3,3,1},{6,1,1,4}};
        int target = 2;
        List<Integer> res = getGoodIndices(var,target);
        System.out.println(res);
    }
    private static List<Integer> getGoodIndices(int[][] variables,int target){
        List<Integer> res = new ArrayList<>();
        int i=0;
        for(int[] arr : variables){
            BigInteger a = BigInteger.valueOf(arr[0]);
            BigInteger b = BigInteger.valueOf(arr[1]);
            BigInteger c = BigInteger.valueOf(arr[2]);
            BigInteger m = BigInteger.valueOf(arr[3]);
            BigInteger base1 = a.modPow(b, BigInteger.TEN);
            BigInteger base2 = base1.modPow(c,m);
            if(base2.equals(BigInteger.valueOf(target))) res.add(i);
            i++;
        }
        return res;
    }
}
