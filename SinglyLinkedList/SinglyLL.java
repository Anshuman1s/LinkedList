public class SinglyLL {
    private Node head;
    private Node tail;
    private int size;
    public SinglyLL(){
        this.size = 0;
    }
    private class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
        }
        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
       
    }
    // insert First
    public void insertFirst(int data){
         Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        } 
        size++;  
    }
    // Insert Last
    public void insertLast(int data) {
        if (tail == null) {
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }
    // Insert Index
    public void insertWithIndex(int data, int index) {
        if (index == 0) {
            insertFirst(data);
            return;
        }
        if (index == size) {
            insertLast(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(data, temp.next);
        temp.next = node;

        
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
