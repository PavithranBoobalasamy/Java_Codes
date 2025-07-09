public class getCount {
    public static void main(String[] args) {
        String str = "5aart6i7io8o5o56";
        int c = 0;
        for(int i=1;i<str.length()-1;i++){
            if(Character.isDigit(str.charAt(i-1)) && Character.isLetter(str.charAt(i)) && Character.isDigit(str.charAt(i+1))) c++;
        }
        System.out.println(c);
    }
}
