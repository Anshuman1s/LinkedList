package DoublyLinkedList;

public class DoublyLL {
    private Node head;
    int size = 0;
    private class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data = data;
        }
        // public Node(int data,Node next , Node prev){
        //     this.data = data;
        //     this.next = next;
        //     this.prev = prev;
            
        // }
    }

    // insertFirst

    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }
    // InsertLast

    public void insertLast(int data){
        Node node = new Node(data);
        Node last = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;

        size++;

    }
    // Insert After
    public void insert(int after,int data){
        Node p = find(after);
        if(p==null){
            System.out.println("Does Not exist");
            return;
        }
        Node node = new Node(data);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }
    public Node find(int data){
        Node node = head;
        while(node != null){
            if(node.data == data){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    // Display The data

    public void Display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.data + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");

        while(last != null){
            System.out.print(last.data +"->");
            last = last.prev;
        }
        System.out.println("END");
        System.out.println(size);
    }
    
}
