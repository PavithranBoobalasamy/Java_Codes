import java.util.HashMap;
import java.util.Map;

public class CountIdealArrays {
    public static void main(String[] args) {
        int n = 9999,maxValue = 9999;
        System.out.println(idealArrays(n,maxValue));
    }

    static final long MOD = 1000000007;

    public static int idealArrays(int n, int maxValue) {
        long count = 0;
        long[] fact = new long[n + 14];
        long[] invFact = new long[n + 14];
        precompute(fact, invFact);

        for (int i = 1; i <= maxValue; i++) {
            HashMap<Long, Long> map = factorize(i);
            long ways = 1;
            for (Map.Entry<Long, Long> entry : map.entrySet()) {
                long e = entry.getValue();
                ways = (ways * combinations(n - 1 + e, e, fact, invFact)) % MOD;
            }
            count = (count + ways) % MOD;
        }

        return (int) count;
    }

    private static HashMap<Long, Long> factorize(long num) {
        HashMap<Long, Long> map = new HashMap<>();
        for (long i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                map.put(i, map.getOrDefault(i, 0L) + 1);
                num /= i;
            }
        }
        if (num > 1) {
            map.put(num, 1L);
        }
        return map;
    }

    private static long combinations(long n, long r, long[] fact, long[] invFact) {
        if (r > n) return 0;
        return (((fact[(int)n] * invFact[(int)r]) % MOD) * invFact[(int)(n - r)]) % MOD;
    }

    private static void precompute(long[] fact, long[] invFact) {
        fact[0] = invFact[0] = 1;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        invFact[fact.length - 1] = pow(fact[fact.length - 1], MOD - 2);
        for (int i = fact.length - 2; i >= 1; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
        }
    }

    private static long pow(long base, long exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
}
