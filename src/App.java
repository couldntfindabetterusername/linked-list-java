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

        list.insertAtHead(56);

        System.out.println("Before removing tail: ");
        list.display();

        list.removeTail();

        System.out.println("After removing tail: ");
        list.display();

        list.insertAtTail(70);

        System.out.println("Searching for 30");
        if (list.search(30))
            System.out.println("Found 30");
        else
            System.out.println("Not found 30");

        System.out.println("Searching for 90");
        if (list.search(90))
            System.out.println("Found 90");
        else
            System.out.println("Not found 90");
    }
}
