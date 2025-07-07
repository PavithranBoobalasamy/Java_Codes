import java.util.ArrayList;

class StackU{
    ArrayList<Integer> stack = new ArrayList<>();
    public void push(int data){
        stack.add(data);
    }

    public int pop(){
        if(!stack.isEmpty()){
            int data = stack.getLast();
            stack.removeLast();
            System.out.println("Popped value :"+data);
            return data;
        }
        else{
            return -1;
        }
    }

    public int peek(){
        if(!stack.isEmpty()){
            return stack.getLast();
        }
        else{
            return -1;
        }
    }

    public void display(){
        if(!stack.isEmpty()){
            for(int num : stack){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        else{
            System.out.println("Stack is empty");
        }
    }
}

public class StackUsingArrayListDemo {
    public static void main(String[] args) {
        StackU stack = new StackU();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.display();
        int num = stack.pop();
        System.out.println(num);
        stack.display();
        int data = stack.peek();
        System.out.println(data);
    }
}
