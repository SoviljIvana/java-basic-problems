public class Main {
    public static void main(String[] args) {


        SortedLinkedList list1 = new SortedLinkedList();
        SortedLinkedList list2 = new SortedLinkedList();
        list1.add(5);
        list1.add(9);
        list1.add(14);
        list1.add(17);
        list1.add(54);
        list1.add(109);
        list2.add(1);
        list2.add(2);
        list2.add(8);
        list2.add(15);
        list2.add(36);
        list2.add(55);
        list2.add(111);
        list2.add(254);
        list2.add(3000);
        list1.print();
        list2.print();
        Merge list3 = new Merge();
        list3.merge(list1, list2);
        list3.print();
    }
}
