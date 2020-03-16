import static java.lang.Math.max;

public class Avltree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    /**
     * This method add elements in AVL tree
     *
     * @param data
     */
    public void insert(int data) {

        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            Node temp = root;
            while (temp.getLeftChild() != null && temp.getRightChild() != null) {
                if (temp.getData() > node.getData() && temp.getLeftChild() != null) {
                    temp = temp.getLeftChild();
                }
                if (node.getData() > temp.getData() && temp.getRightChild() != null) {
                    temp = temp.getRightChild();
                }
            }
            if (node.getData() < temp.getData()) {
                while (temp.getLeftChild() != null) {
                    temp = temp.getLeftChild();
                }
                if (node.getData() > temp.getData()) {
                    temp.setRightChild(node);
                    node.setParent(temp);
                } else {
                    temp.setLeftChild(node);
                    node.setParent(temp);
                }
            } else if (node.getData() > temp.getData()) {
                while (temp.getRightChild() != null) {
                    temp = temp.getRightChild();
                }
                if (node.getData() < temp.getData()) {
                    temp.setLeftChild(node);
                    node.setParent(temp);
                } else {
                    temp.setRightChild(node);
                    node.setParent(temp);
                }
            }
        }
        check(node);
    }

    /**
     * A recursive method for printing AVL tree
     *
     * @param node
     */
    public void print(Node node) {
        if (node == null) {
            return;
        }
        print(node.getLeftChild());
        System.out.print("\t" + node.getData());
        print(node.getRightChild());
    }

    /**
     * This method finds a node with the entered data and returns the data if it exists in the avl tree
     *
     * @param data
     * @return
     */
    public boolean search(int data) {
        if (data == root.getData()) {
            return true;
        } else {
            Node temp = root;
            while (temp.getLeftChild() != null || temp.getRightChild() != null) {
                if (temp.getData() > data && temp.getLeftChild() != null) {
                    temp = temp.getLeftChild();
                } else if (data > temp.getData() && temp.getRightChild() != null) {
                    temp = temp.getRightChild();
                }
                if (data == temp.getData()) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * This method removes the node
     *
     * @param data
     */
    public void remove(int data) {
        Node temp = root;
        if (data == temp.getData()) {
            removeRoot();
        } else {
            while (temp.getData() != data) {
                if (temp.getData() > data) {
                    temp = temp.getLeftChild();
                } else if (data > temp.getData()) {
                    temp = temp.getRightChild();
                }
            }
            if (data < temp.getParent().getData()) {
                removeTheLeftChild(temp.getParent());
            } else if (data > temp.getParent().getData()) {
                removeTheRightChild(temp.getParent());
            }
        }
    }

    /**
     * This method goes to the root and, if necessary, invites method for rotation
     *
     * @param node
     */
    private void check(Node node) {
        while (node != null) {
            if (balanceFactor(node) == 2) {
                if (balanceFactor(node.getLeftChild()) == 1) {
                    rightRotation(node);
                } else if (balanceFactor(node.getLeftChild()) == -1) {
                    leftRotation(node.getLeftChild());
                    rightRotation(node);
                } else {
                    rightRotation(node);
                }
            }
            if (balanceFactor(node) == -2) {
                if (balanceFactor(node.getRightChild()) == -1) {
                    leftRotation(node);
                } else if (balanceFactor(node.getRightChild()) == 1) {
                    rightRotation(node.getRightChild());
                    leftRotation(node);
                } else {
                    leftRotation(node);
                }
            }
            node = node.getParent();
        }
    }

    /**
     * This method checks how many children have a node to be removed
     *
     * @param node
     * @return 0, 1 or 2
     */
    private int checkTheNumberOfChildren(Node node) {
        if (node.getLeftChild() == null && node.getRightChild() == null) {
            return 0;
        } else if ((node.getLeftChild() != null && node.getRightChild() == null) || (node.getLeftChild() == null && node.getRightChild() != null)) {
            return 1;
        }
        return 2;
    }

    /**
     * This method checks the balance of the Node in AVL tree
     *
     * @param node
     * @return
     */
    private int balanceFactor(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.getLeftChild()) - height(node.getRightChild());
    }

    /**
     * This method returns height of the Node in AVL tree
     *
     * @param node
     * @return
     */
    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + max(height(node.getLeftChild()), height(node.getRightChild()));
    }

    /**
     * This method remove root
     */
    private void removeRoot() {
        if (checkTheNumberOfChildren(root) == 0) {
            root = null;
        } else if (checkTheNumberOfChildren(root) == 1) {
            if ((root.getLeftChild() != null && root.getRightChild() == null)) {
                root = root.getLeftChild();
                check(root);
            } else if ((root.getLeftChild() == null && root.getRightChild() != null)) {
                root = root.getRightChild();
                check(root);
            }
        } else {
            removeTheNodeWithTwoChildren(root);
        }
    }

    /**
     * This method removes the node
     *
     * @param node
     */
    private void removeTheLeftChild(Node node) {
        if (checkTheNumberOfChildren(node.getLeftChild()) == 0) {
            node.setLeftChild(null);
            check(node);
        } else if (checkTheNumberOfChildren(node.getLeftChild()) == 1) {
            if (node.getLeftChild().getRightChild() != null && node.getLeftChild().getLeftChild() == null) {
                node.setLeftChild(node.getLeftChild().getRightChild());
                node.getLeftChild().setParent(node);
                check(node);
            } else if (node.getLeftChild().getRightChild() == null && node.getLeftChild().getLeftChild() != null) {
                node.setLeftChild(node.getLeftChild().getLeftChild());
                node.getLeftChild().setParent(node);
                check(node);
            }
        } else {
            removeTheNodeWithTwoChildren(node.getLeftChild());
        }
    }

    /**
     * This method removes the node
     *
     * @param node
     */
    private void removeTheRightChild(Node node) {
        if (checkTheNumberOfChildren(node.getRightChild()) == 0) {
            node.setRightChild(null);
            check(node);
        } else if (checkTheNumberOfChildren(node.getRightChild()) == 1) {
            if (node.getRightChild().getLeftChild() != null && node.getRightChild().getRightChild() == null) {
                node.setRightChild(node.getRightChild().getLeftChild());
                node.getRightChild().setParent(node);
                check(node);
            } else if
            (node.getRightChild().getLeftChild() == null && node.getRightChild().getRightChild() != null) {
                node.setRightChild(node.getRightChild().getRightChild());
                node.getRightChild().setParent(node);
                check(node);
            }
        } else {
            removeTheNodeWithTwoChildren(node.getRightChild());
        }
    }

    /**
     * This method rotates to the right
     *
     * @param node
     */
    private void rightRotation(Node node) {
        Node nodeLeftChild = node.getLeftChild();
        Node nodeLeftChildRightChild = nodeLeftChild.getRightChild();
        if (node == root) {
            root = nodeLeftChild;
            nodeLeftChild.setParent(null);
            nodeLeftChild.setRightChild(node);
            node.setLeftChild(nodeLeftChildRightChild);
            node.setParent(nodeLeftChild);
            if (nodeLeftChildRightChild != null) {
                nodeLeftChildRightChild.setParent(node);
            }
        } else {
            Node nodeParent = node.getParent();
            if (nodeParent.getData() > nodeLeftChild.getData()) {
                nodeParent.setLeftChild(nodeLeftChild);
            }
            if (nodeParent.getData() < nodeLeftChild.getData()) {
                nodeParent.setRightChild(nodeLeftChild);
            }
            nodeLeftChild.setParent(nodeParent);
            nodeLeftChild.setRightChild(node);
            node.setParent(nodeLeftChild);
            node.setLeftChild(nodeLeftChildRightChild);
            if (nodeLeftChildRightChild != null) {
                nodeLeftChildRightChild.setParent(node);
            }
        }
    }

    /**
     * This method rotates to the left
     *
     * @param node
     */
    private void leftRotation(Node node) {
        Node nodeRightChild = node.getRightChild();
        Node nodeRightChildLeftChild = nodeRightChild.getLeftChild();
        if (node == root) {
            root = nodeRightChild;
            nodeRightChild.setParent(null);
            nodeRightChild.setLeftChild(node);
            node.setParent(nodeRightChild);
            node.setRightChild(nodeRightChildLeftChild);
            if (nodeRightChildLeftChild != null) {
                nodeRightChildLeftChild.setParent(node);
            }
        } else {
            Node nodeParent = node.getParent();
            if (nodeParent.getData() > nodeRightChild.getData()) {
                nodeParent.setLeftChild(nodeRightChild);
            }
            if (nodeParent.getData() < nodeRightChild.getData()) {
                nodeParent.setRightChild(nodeRightChild);
            }
            nodeRightChild.setParent(nodeParent);
            nodeRightChild.setLeftChild(node);
            node.setParent(nodeRightChild);
            node.setRightChild(nodeRightChildLeftChild);
            if (nodeRightChildLeftChild != null) {
                nodeRightChildLeftChild.setParent(node);
            }
        }
    }

    /**
     * This method removes the node with two children
     *
     * @param node
     */
    private void removeTheNodeWithTwoChildren(Node node) {
        Node temp = node.getRightChild();  /*replacement for deleted node*/
        Node nodeLeft = node.getLeftChild();
        Node nodeRight = node.getRightChild();
        Node nodeParent = node.getParent();
        while (temp.getLeftChild() != null) {
            temp = temp.getLeftChild();
        }
        Node temp1 = temp.getParent();
        Node temp2 = temp.getRightChild();
        if (node == root) {
            root = temp;
            temp.setParent(null);
        } else {
            temp.setParent(nodeParent);
        }
        temp.setLeftChild(nodeLeft);
        nodeLeft.setParent(temp);
        if (temp != nodeRight) {
            temp.setRightChild(nodeRight);
            nodeRight.setParent(temp);
            temp1.setLeftChild(temp2);
        }
        if (temp2 != null) {
            temp2.setParent(temp1);
        }
        if (nodeParent != null) {
            if (nodeParent.getRightChild() != null) {
                if (nodeParent.getRightChild() == node) {
                    nodeParent.setRightChild(temp);
                } else {
                    nodeParent.setLeftChild(temp);
                }
            }
        }
        check(temp);
    }

}