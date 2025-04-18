class Queue{
    int queueLength = 5;
    int[] queue = new int[queueLength];
    int rear = -1;
    int front = -1;
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        if (front == -1) front = 0;
        rear++;
        queue[rear] = data;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued value :"+queue[front]);
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Queue: ");
        for(int i=front ; i<= rear ; i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return (rear==-1 && rear==front);
    }
    public boolean isFull(){
        return rear == queueLength-1;
    }
    public int peek(){
        if(!isEmpty()){
            return queue[front];
        }
        else{
            return -1;
        }
    }
    public int getRear(){
        if(!isEmpty()){
            return queue[rear];
        }
        else{
            return -1;
        }
    }
}
public class QueueUsingArrayDemo {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        System.out.println("Rear value : "+q.getRear());
        System.out.println("Front value : "+q.peek());
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}