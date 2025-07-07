public class GetMax{
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidabooo";
        System.out.println(checkInclusion(s1, s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s2.length()< s1.length()) return false;
        int n = s1.length();
        int[] freq1 = new int[26];
        for(char ch : s1.toCharArray()){
            freq1[ch-'a']++;
        }
        for(int i=0;i<s2.length()-n+1;i++){
            int[] freq = new int[26];
            int r = i+n;
            for(int j = i;j<r;j++){
                freq[s2.charAt(j)-'a']++;
            }
            for(int j=0;j<26;j++){
                if(freq1[j]!=freq[j]) break;
            }
            return true;
        }
        return false;
    }
}