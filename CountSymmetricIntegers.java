public class CountSymmetricIntegers {
    public static void main(String[] args) {
        int count = 0;
        int start = 1;
        int end = 21;
        while(start <= end){
            if(start==end){
                if(symmetric(start)) count++;
            }
            else{
                if(symmetric(start)) count++;
                if(symmetric(end)) count++;
            }
            start++;
            end--;
        }
        System.out.println("Count : "+count);
    }
    public static boolean symmetric(int num){
        int digits = (int) Math.floor(Math.log10(num))+1;
        if(digits%2!=0) return false;
        else{
            digits/=2;
            String firstHalf = Integer.toString(num).substring(0,digits);
            String secondHalf = Integer.toString(num).substring(digits);
            int sum1 = 0;
            int sum2 = 0;
            for(int i=0;i<digits;i++){
                sum1+=(firstHalf.charAt(i)-'0');
                sum2+=(secondHalf.charAt(i)-'0');
            }
            System.out.println("Num : " + num + " sum1 : " + sum1 + " sum2 : " + sum2);
            return sum1==sum2;
        }
    } 
}
