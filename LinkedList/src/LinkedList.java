public class LinkedList {
    Node head = null;
    int size = 0;
    double sum = 0;

    /**
     *
     */
    public synchronized void write() {
        for (int index = 0; index < array.length; index++) {
            array[index] = array[data];
            data++;
        }
    }
    /**
     * This method add elements in list
     *
     * @param data
     */
    public void add(double data) {


        Node n = new Node(data);
        if (head == null) {
            head = n;
            n.setPrev(null);
            sum += head.getData();
            size++;
        } else {

            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(n);
            size++;
            sum += n.getData();
        }
    }

    /**
     * This method print list with all elements
     */
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

    /**
     * This method remove element
     *
     * @param position
     */
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
            size--;
        }
        if (position > 0 && position <= size) {
            for (int i = 0; i < position - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
            size--;
        }
    }

    /**
     * This method add number at position
     *
     * @param position
     * @param data
     */
    public void addAtPosition(int position, double data) {
        Node n = new Node(data);
        if (position > size) {
            System.out.println("Error!");
        }
        if (position == 0) {
            n.setNext(head);
            head = n;
            sum += head.getData();
            size++;
        }
        if (position > 0 && position <= size) {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.getNext();
            }
            n.setNext(temp.getNext());
            temp.setNext(n);
            size++;
            sum += n.getData();
        }

    }

    /**
     * This method return average value (list)
     *
     * @return
     */
    public double averageValue() {
        double average;
        average = (sum / size);
        return average;
    }

    /**
     * This method delete elements on even positions
     */
    public void deleteElementsOnEvenPositions() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty!");
        }
        if (size % 2 != 0) {
            while (temp.getNext() != null) {
                temp.setNext(temp.getNext().getNext());
                temp = temp.getNext();
            }
        }
        if (size % 2 == 0) {
            while (temp.getNext() != null) {
                temp.setNext(temp.getNext().getNext());
                temp = temp.getNext();
                if (temp.getNext().getNext() == null) {
                    temp.setNext(temp.getNext().getNext());
                }
            }
        }
    }

    /**
     * this method finds the position of the node
     *
     * @param data
     * @return
     */
    public int searchForTheNode(double data) {
        int position = 0;
        Node temp = head;
        while (temp != null) {
            position++;
            if (temp.getData() == data) {
                return position;
            }
            temp = temp.getNext();
        }
        return -1;
    }

    /**
     * This method compare two elements in linked list and returns the position of a greater element
     *
     * @param position1
     * @param position2
     * @return
     */
    public int compareElements(int position1, int position2) {
        Node temp = head;
        int position = 0;
        double temp1 = 0;
        double temp2 = 0;

        if (position1 > size || position1 <= 0 || position2 > size || position2 <= 0) {
            return -1;
        }
        while (temp != null) {
            position++;
            if (position == position1) {
                temp1 = temp.getData();
            }
            if (position == position2) {
                temp2 = temp.getData();
            }
            temp = temp.getNext();
        }
        if (temp1 > temp2) {
            return position1;
        }
        if (temp1 < temp2) {
            return position2;
        }
        if (position1 == position2) {
            System.out.println("Element's are equal");
        }
        return -1;
    }

    /**
     * this method inserts into the new head
     * elements that are divided by two,
     * and in the new head inserts elements that are not divisible by two.
     *
     * @param head
     */
    public void newTwoLists(Node head) {

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (head != null) {
            if (head.getData() % 2 == 0) {
                list1.add(head.getData());
            }
            if (head.getData() % 2 != 0) {
                list2.add(head.getData());
            }
            head = head.getNext();
        }
        list1.print();
        list2.print();
    }

    /**
     * Print all notes which are bigger then given number 
     *
     * @param data
     */
    public void greaterThanGivenValue(double data) {

        Node n = new Node(data);
        Node temp = head;

        double max = temp.getData();
        while (temp != null) {
            if (temp.getData() > max) {
                max = temp.getData();
            }
            temp = temp.getNext();
        }
        temp = head;
        while (temp != null) {
            if (n.getData() > max) {
                System.out.println("Node doesn't exist!");
                return;
            }
            if (temp.getData() > n.getData()) {
                System.out.println(temp.getData() + " is greater than " + n.getData());
            }
            temp = temp.getNext();
        }
    }
}
