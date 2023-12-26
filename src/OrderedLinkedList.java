public class OrderedLinkedList extends LinkedList {
    @Override
    public void insert(int data) {
        if (head == null || head.value >= data) {
            insertAtHead(data);
        } else {
            Node currentNode = head;
            while (currentNode.next != null && currentNode.next.value < data) {
                currentNode = currentNode.next;
            }
            Node nodeToBeAdded = new Node(data);
            nodeToBeAdded.next = currentNode.next;
            currentNode.next = nodeToBeAdded;
        }
    }
}
