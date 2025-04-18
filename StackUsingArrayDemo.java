class Stack{
    int stack_length = 5;
    int[] stack = new int[stack_length];
    int top = -1;
    public void push(int data){
        if(isFull()){
            System.out.println("Stack full");
            return;
        }
        
        stack[++top] = data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack empty");
            return -1;
        }
        int data = stack[top];
        stack[top--] = 0;
        System.out.println("Popped value :"+ data);
        return data;
    }
    public void show(){
        System.out.println("Stack");
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public int peek(){
        if(!isEmpty()){
            System.out.println("Top value: "+ stack[top]);
            return stack[top];
        }
        else{
            System.out.println("Stack empty..");
            return -1;
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==stack_length-1;
    }
}

public class StackUsingArrayDemo{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.show();
        int val = s.pop();
        System.out.println(val);
        int num = s.peek();
        System.out.println(num);
        
    }
}