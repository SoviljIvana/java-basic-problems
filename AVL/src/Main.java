public class Main {
    public static void main(String[] args) {

        Avltree tree = new Avltree();


        tree.insert(1);
        tree.insert(3);
        tree.insert(2);
        tree.remove(2);
/*
        if (tree.search(13)) {
            System.out.println("Requested node found");
        } else {
            System.out.println("xxx");
        }
*/
        tree.print(tree.getRoot());
    }
}
