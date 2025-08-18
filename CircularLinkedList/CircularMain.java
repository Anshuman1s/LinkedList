package CircularLinkedList;

public class CircularMain {
    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.insertData(13);
        cll.insertData(26);
        cll.insertData(39);
        cll.insertData(52);
        cll.display();
        cll.delete(52);
        cll.display();

    }
}
