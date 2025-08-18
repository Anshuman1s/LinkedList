package DoublyLinkedList;

public class DoublyMain {
    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.insertFirst(3);
        ll.insertFirst(9);
        ll.insertFirst(12);
        ll.insertFirst(15);
        ll.insertLast(21);
        ll.insert(12, 11);
        ll.Display();
        
    }
}
