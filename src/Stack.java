public class Stack {
    LinkedList list;

    Stack() {
        list = new LinkedList();
    }

    public void push(int data) {
        list.insertAtHead(data);
    }

    public void pop() {
        list.removeHead();
    }

    public int peek() {
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
