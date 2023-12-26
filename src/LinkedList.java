public class LinkedList {
    public Node head;

    LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node nodeToBeAdded = new Node(data);

        if (this.head == null) {
            this.head = nodeToBeAdded;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nodeToBeAdded;
        }
    }

    public void display() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
