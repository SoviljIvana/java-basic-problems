public class DoublyLinkedList extends LinkedList {
    Node head = null;
    int size = 0;
    double sum = 0;

    /**
     * This method adds an element to the list and shows the previous node
     *
     * @param data
     */
    @Override

    public void add(double data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            head.setPrev(null);
            sum += head.getData();
            size++;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            n.setPrev(temp);
            temp.setNext(n);
            size++;
            sum += n.getData();
        }
    }

    /**
     * This method removes the node from the list and displays the previous node
     *
     * @param position
     */
    @Override

    public void removeFromPosition(int position) {
        Node temp = head;

        if (head == null) {
            System.out.println("List is empty.");
        }
        if (position > size) {
            System.out.println("\n Can't delete done, because node at that position doesn't exist.");
        }
        if (position == 0) {
            head = temp.getNext();
            head.setPrev(null);
            size--;
        }
        size--;
        if (position > 0 && position < size) {
            for (int i = 0; i < position - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
            temp.getNext().setPrev(temp);
            size--;
        }
        if (position == size) {
            for (int i = 0; i < position - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(null);
        }
    }

    /**
     * This method adds the node at position and displays the previous node
     *
     * @param position
     * @param data
     */
    @Override
    public void addAtPosition(int position, double data) {
        Node n = new Node(data);
        if (position > size) {
            System.out.println("Error!");
        }
        if (position == 0) {
            n.setPrev(null);
            n.setNext(head);
            head.setPrev(n);
            head = n;
            sum += head.getData();
            size++;
        }
        if (position > 0 && position < size) {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.getNext();
            }
            n.setNext(temp.getNext());
            temp.getNext().setPrev(n);
            temp.setNext(n);
            n.setPrev(temp);
            size++;
            sum += n.getData();
        }
        if (position == size) {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.getNext();
            }
            n.setNext(temp.getNext());
            temp.setNext(n);
            n.setPrev(temp);
        }
    }

    /**
     * This method print list with all elements
     */
    @Override
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        while (temp.getNext() != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println(temp.getData());
    }
}

