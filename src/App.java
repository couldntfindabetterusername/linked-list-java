public class App {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();

        list.insertAtTail(56);
        list.insertAtTail(30);
        list.insertAtTail(70);

        System.out.println("Before removing head: ");
        list.display();

        list.removeHead();

        System.out.println("After removing head: ");
        list.display();
    }
}
