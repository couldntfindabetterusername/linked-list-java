public class Queue {
    LinkedList list;

    Queue() {
        list = new LinkedList();
    }

    public void enqueue(int data) {
        list.insertAtTail(data);
    }

    public void dequeue() {
        list.removeHead();
    }

    public int front() {
        if (list.head == null)
            return -1;
        return list.head.value;
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void display() {
        list.display();
    }
}
