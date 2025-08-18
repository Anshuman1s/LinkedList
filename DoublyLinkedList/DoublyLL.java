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
            head.prev = node;
        }
        head = node;
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
    }
    
}
