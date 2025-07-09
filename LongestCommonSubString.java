public class LongestCommonSubString {
    public static void main(String[] args) {
        String s1 = "adventure";
        String s2 = "future";

        String result = getLongestSubstring(s1,s2);
        System.out.println(result);
        int sum = 0;
        for(char ch : result.toCharArray()){
            sum += (int) ch;
        }
        System.out.println(sum);
    }
    private static String getLongestSubstring(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        int maxlen = 0;
        int endIndex = -1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    if(dp[i][j] > maxlen){
                        maxlen = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        return s1.substring(endIndex-maxlen,endIndex);

    }
}
