import java.util.Stack;
public class ValidParantheses {
    public static void main(String[] args) {
        String s = "((()))))";
        System.out.println(isValid(s));
    }
    private static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                stack.push(c);
            }
            else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
