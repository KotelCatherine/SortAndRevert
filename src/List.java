public class List {
    private Node head;

    public void add(int value){
        Node newNode = new Node(value);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void revert() {
        if (head != null && head.next != null) {
            revert(head.next, head);
        }
    }
    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }

        currentNode.next = previousNode;
        previousNode.next = null;
    }
}
