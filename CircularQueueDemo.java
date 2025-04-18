class CircularQueue {
    int size;
    int front, rear;
    int[] queue;
    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    public boolean isFull() {
        return (rear + 1) % size == front;
    }
    public boolean isEmpty() {
        return front == -1;
    }
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = value;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return val;
    }
    public void display(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}
public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.display();
        System.out.println("Dequeued: " + cq.dequeue());
        System.out.println("Dequeued: " + cq.dequeue());
        cq.display();
        cq.enqueue(50);
        cq.enqueue(60);
        cq.enqueue(70);
        cq.display();
        while (!cq.isEmpty()) {
            System.out.println("Dequeued: " + cq.dequeue());
        }
        System.out.println("Dequeued: " + cq.dequeue());
    }
}
