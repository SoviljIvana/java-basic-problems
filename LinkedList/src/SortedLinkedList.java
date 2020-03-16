public class SortedLinkedList extends LinkedList {
    @Override
    public void add(double data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
        } else if (n.getData() <= head.getData()) {
            n.setNext(head);
            head = n;
        } else {
            Node temp = head;
            while (temp.getNext() != null && temp.getNext().getData() < data) {
                temp = temp.getNext();
            }
            n.setNext(temp.getNext());
            temp.setNext(n);
        }
    }
}
