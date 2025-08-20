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
    // Insertion Using Recursion 
    public void insertRec(int data,int index){
        head = insertRec(data, index,head);
    }
    private Node insertRec(int data,int index,Node node){
        if(index == 0){
            Node temp = new Node(data,node);
            size++;
            return temp;
        }
        node.next = insertRec(data, index-1, node.next);
        return node;
    }
    //Delete First
    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    // Delete Last
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
     public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    // Delete Index
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.data;

        prev.next = prev.next.next;
        size--;
        return val;
    }
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
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
