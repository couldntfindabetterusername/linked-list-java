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

        list.insertAfter(56, 100);
        System.out.println("Inserting 100 after 56");
        list.display();

        list.remove(56);
        System.out.println("After removing 56");
        list.display();

        System.out.println("********** Ordered list ***********");
        OrderedLinkedList orderedList = new OrderedLinkedList();
        orderedList.insert(25);
        orderedList.insert(10);
        orderedList.insert(30);

        System.out.println("Displaying ordered linked list");
        orderedList.display();

        System.out.println("********** Stack ***********");
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Displaying stack: ");
        stack.display();

        stack.pop();
        stack.pop();

        System.out.println("Displaying stack after 2 pops: ");
        stack.display();

        System.out.println("Peek element of stack: " + stack.peek());

        if (stack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is not empty");

        System.out.println("********** Queue ***********");
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Displaying queue: ");
        queue.display();

        queue.dequeue();
        queue.dequeue();

        System.out.println("Displaying queue after 2 dequeues: ");
        queue.display();

        System.out.println("Front element of queue: " + queue.front());

        if (queue.isEmpty())
            System.out.println("Queue is empty");
        else
            System.out.println("Queue is not empty");
    }
}
