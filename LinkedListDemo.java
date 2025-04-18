class LinkedList{

    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    Node head;


    public void add(int i) {
        if(head==null){
            Node newNode = new Node(i);
            head = newNode;
        }
        else{
            Node newNode = new Node(i);
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addFirst(int i) {
        Node newNode = new Node(i);
        newNode.next = head;
        head = newNode;
    }

    public void addAt(int i, int j) {
        if(i<0){
            System.out.println("Invalid indexing...");
            return;
        }
        if(i==0){
            Node newNode = new Node(j);
            newNode.next = head;
            head = newNode;
        }
        else{
            int count=0;
            Node temp = head;
            Node newNode = new Node(j);
            while(temp!=null){
                if(count == i-1){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    return;
                }
                temp = temp.next;
                count++;
            }
            System.out.println("Position out of bounds.");
        }
    }

    public void delete(int i) {
        if(head.data==i){
            head = head.next;
        }
        else{
            Node temp = head;
            while(temp!=null){
                if(temp.next.data==i){
                    temp.next = temp.next.next;
                    return;
                }
                else{
                    temp = temp.next;
                }
            }
        }
    }

    public void deleteAt(int i){
        if(i<0 || head==null){
            System.out.println("Invalid  position or empty list.");
            return;
        }
        if(i == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        int count = 0;
        while(temp!=null && count<i-1){
            temp = temp.next;
            count++;
        }
        if(temp == null || temp.next == null){
            System.out.println("Position out of bounds.");
            return;
        }
        temp.next = temp.next.next;
    }

    public void search(int i) {
        int n = 1;
        Node temp = head;
        while(temp!=null){
            if(temp.data == i){
                System.out.println("Element found at :"+n);
                return;
            }
            n++;
            temp = temp.next;
        }
        System.out.println("Element not found in the linkedlist.");
    }

    public void display() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int size(){
        int count=0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;  
            current.next = prev;  
            prev = current;       
            current = next;       
        }
        head = prev;
    }
    
}
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(20);
        l.add(40);
        l.display();
        l.addFirst(10);
        l.display();
        l.addAt(2,30);
        l.display();
        l.delete(10);
        l.display();
        l.search(20);
        l.deleteAt(2);
        l.display();
    }
}