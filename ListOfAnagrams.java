import java.util.ArrayList;
import java.util.List;

public class ListOfAnagrams {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        System.out.println(findAnagrams(s,p));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        for(int j=0;j<s.length();j++){
            if(j>= p.length()-1){
                if(isAnagram(s.substring(i,j+1),p)) result.add(i);
                i++;
            }
            
        }
        return result;
    }
    private static boolean isAnagram(String s,String p){
        int[] freq = new int[26];
        for(char ch : p.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch : s.toCharArray()){
            freq[ch-'a']--;
        }
        for(int num : freq) if(num != 0) return false;
        return true;
    }
}
