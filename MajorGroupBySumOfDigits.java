import java.util.Map;
import java.util.TreeMap;

public class MajorGroupBySumOfDigits{
    public static void main(String[] args) {
        int n = 13;
        System.out.println(countLargestGroup(n));
    }
    public static int countLargestGroup(int n){
        TreeMap<Integer,Integer> freq = new TreeMap<>();
        for(int i=1;i<=n;i++){
            int sum = findSum(i);
            freq.put(sum,freq.getOrDefault(sum,0)+1);
        }
        int maxSize = 0;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            maxSize = Math.max(maxSize, entry.getValue());
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue() == maxSize) count++;
        }
        return count;
    }
    public static int findSum(int num){
        int sum =0;
        while(num>0){
            sum+=(num%10);
            num/=10;
        }
        return sum;
    }
}