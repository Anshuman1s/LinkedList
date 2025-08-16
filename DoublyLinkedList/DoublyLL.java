package DoublyLinkedList;

public class DoublyLL {
    private Node head;
    private class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
        public Node(int data,Node next , Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    // insertFirst

    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = null;
        }
        head = node;
    }
    // Display The data

    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println("End");
    }
    
}
