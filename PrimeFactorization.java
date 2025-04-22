import java.util.HashMap;

public class PrimeFactorization {
    public static void main(String[] args) {
        int num = 1 ;
        HashMap<Integer,Integer> map = factorize(num);
        System.out.println(map);
    }
    private static HashMap<Integer,Integer> factorize(int num){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=2;i*i <= num; i++){
            while(num%i == 0){
                map.put(i,map.getOrDefault(i,0)+1);
                num/=i;
            }
        }
        if(num>=1){
            map.put(num,1);
        }
        return map;
    }
}
