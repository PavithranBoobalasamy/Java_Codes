import java.util.ArrayList;
// import java.util.Stack;
import java.util.List;
import java.math.BigInteger;
public class Learning {
    public static void main(String[] args) {
        // int[] ar = {1,2,3};
        // int[] v = ar;
        // for(int num : v){
        //     System.out.println(num);
        // }
        // int num = 12;
        // StringBuilder result =new StringBuilder(Integer.toBinaryString(num));
        // for(int i=0;i<result.length();i++){
        //     if(result.charAt(i)  == '1'){
        //         result.setCharAt(i,'0');
        //         break;
        //     }
        // }
        // System.out.println(Integer.parseInt(result.toString(),2));
        System.out.println(1^0);
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(4);
        int num = list.getLast();
        System.out.println(num);
        // int k = 39;
        // int count = (int)Math.ceil(Math.log(k)/Math.log(2));
        // System.out.println(count);
        // System.out.println(new String("a"));
        // String a = "aab";
        // String[] arr = a.split("");
        // for(String s : arr){
        //     System.out.println(s);
        // }
        char s = 'a';
        System.out.println(Character.toUpperCase(s));
        String res = "LEETCODELEETLEET";
        System.out.println(res.replace("LEET",""));
        StringBuilder sb = new StringBuilder("abc");
        sb.deleteCharAt(sb.length()-1);
        long m = 1000;
        System.out.println(Math.pow(9,m));
        System.out.println(BigInteger.valueOf(m));
    }
}
