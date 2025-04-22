public class Combinatorics {
    public static void main(String[] args) {
        long n = 5;
        long r = 2;
        System.out.println(combinations(n,r));
    }
    private static long combinations(long n , long r){
        return factorial(n)/(factorial(r) * factorial(n-r));
    }
    private static  long factorial(long num){
        if(num ==1) return 1;
        else return num * factorial(num-1);
    }
}
