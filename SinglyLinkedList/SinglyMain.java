

public class SinglyMain {
    public static void main(String[] args) {
        SinglyLL ll = new SinglyLL();
        ll.insertFirst(12);
        ll.insertFirst(24);
        ll.insertFirst(36);
        ll.insertFirst(48);
        ll.insertLast(51);
        ll.insertWithIndex(101, 3);
        ll.display();
    }
}
