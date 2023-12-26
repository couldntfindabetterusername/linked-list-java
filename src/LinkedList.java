public class LinkedList {
    public Node head;

    LinkedList() {
        this.head = null;
    }

    public void insertAtHead(int data) {
        Node nodeToBeAdded = new Node(data);
        nodeToBeAdded.next = this.head;
        this.head = nodeToBeAdded;
    }

    public void insertAtTail(int data) {
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

    public void insertBetween(int data1, int data2, int data) {
        Node nodeToBeAdded = new Node(data);
        Node current = this.head;

        while (current.next != null) {
            if (current.value == data1 && current.next.value == data2) {
                nodeToBeAdded.next = current.next;
                current.next = nodeToBeAdded;
                break;
            }
        }
    }

    public void removeHead() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void removeTail() {
        if (head == null) {
            return;
        }

        Node current = this.head;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }

    public boolean search(int key){
        Node current = this.head;
        while (current!= null) {
            if(current.value == key){
                return true;
            }
            current = current.next;
        }
        return false;
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
