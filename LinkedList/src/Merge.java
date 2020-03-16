public class Merge extends LinkedList {

    public void merge(LinkedList list1, LinkedList list2) {

        Node temp1 = list1.head;
        Node temp2 = list2.head;

        while (temp1.getNext() != null || temp2.getNext() != null) {
            while (temp1.getData() <= temp2.getData()) {
                add(temp1.getData());
                temp1 = temp1.getNext();
                if (temp1 == null) {
                    while (temp2.getNext() != null) {
                        add(temp2.getData());
                        temp2 = temp2.getNext();
                    }
                    add(temp2.getData());
                    return;
                } else if (temp2 == null) {
                    while (temp1.getNext() != null) {
                        add(temp1.getData());
                        temp1 = temp1.getNext();
                    }
                    add(temp1.getData());
                    return;
                }
            }
            while (temp1.getData() > temp2.getData()) {
                add(temp2.getData());
                temp2 = temp2.getNext();
                if (temp1 == null) {
                    while (temp2.getNext() != null) {
                        add(temp2.getData());
                        temp2 = temp2.getNext();
                    }
                    add(temp2.getData());
                    return;
                } else if (temp2 == null) {
                    while (temp1.getNext() != null) {
                        add(temp1.getData());
                        temp1 = temp1.getNext();
                    }
                    add(temp1.getData());
                    return;
                }
            }
        }

    }
}



