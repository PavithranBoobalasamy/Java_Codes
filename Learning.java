// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;

public class Learning {
    public static void main(String[] args) {
        int[] ar = {1,2,3};
        int[] v = ar;
        for(int num : v){
            System.out.println(num);
        }
        // List<Integer> list = new ArrayList<>();
        Arrays.fill(ar,0);
        for(int num : v){
            System.out.println(num);
        }
         // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='z'){
        //         ar[0]++;
        //         ar[1]++;
        //     }
        //     else{
        //         ar[s.charAt(i)-'a'+1]++;
        //     }
        // }
        // for(int um  : ar){
        //     System.out.println(um);
        // }
    }
}
