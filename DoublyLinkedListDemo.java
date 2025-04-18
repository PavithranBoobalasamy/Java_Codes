class DoublyLinkedList{
    class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null) head = tail = newNode;
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
            tail = newNode;
        }
    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertLast(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertAt(int index, int data){
        if(index ==0){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
            }
            else{
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
            }
            return;
        }
        int count = 0;
        Node newNode = new Node(data);
        Node temp = head;
        while(temp!=null && count<index-1){
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }
        if (temp.next == null) {
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;
        }
        else{
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }
    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Linked list is empty.");
            return;
        }
        if (head == tail && head.data == data) {
            head = tail = null;
            return;
        }
        if (head.data == data) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }
        if (tail.data == data) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
            return;
        }
        Node temp = head.next;
        while (temp != null && temp != tail) {
            if (temp.data == data) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data not found in the list.");
    }
    public void deleteAt(int index){
        if(isEmpty()){
            System.out.println("LinkedList is Empty..");
            return;
        }
        if(index == 0){
            if(head == tail){
                head = tail = null;
                return;
            }
            head = head.next;
            head.prev = null;
            return;
        }
        int count = 0;
        Node temp = head;
        while (temp != null && count < index) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }
        if (temp == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int search(int data){
        if(isEmpty()){
            System.out.println("LinkedList is Empty..");
            return -1;
        }
        Node temp = head;
        int index = 0;
        while(temp!=null){
            if(temp.data == data){
                System.out.println("The element found at the index :"+index);
                return index;
            }
            index++;
            temp = temp.next;
        }
        System.out.println("Element not found in the list");
        return -1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("The LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }    
}
public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertFirst(10);
        dl.display();
        dl.insertFirst(20);
        dl.display();
        dl.insertLast(30);
        dl.display();
        dl.insertAt(1,15);
        dl.display();
        dl.insertLast(40);
        dl.insertFirst(50);
        dl.insertLast(60);
        dl.insertFirst(70);
        dl.delete(70);
        dl.display();
        dl.deleteAt(2);
        dl.display();
        int index = dl.search(50);
        System.out.println(index);
        System.out.println(dl.isEmpty());
    }
}