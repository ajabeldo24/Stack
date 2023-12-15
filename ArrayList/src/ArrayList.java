public class ArrayList <T> {

    private Node<T> rootNode = new Node<>();
    private T data;
    private int size;

    public ArrayList() { //Empty Constructor

    }

    public boolean Add (T data) {
        if (rootNode.getValue() == null) { //if rootNode is null, it'll initialize it with data and return true
            rootNode.setValue(data);
            return true;
        }else if (rootNode.getValue() != null) { //if not, it'll make a new node and initialize it with the data, set the parent to rootNode, and return true
            Node<T> newNode = new Node<>();
            newNode.setValue(data);
            rootNode.setChildNode(newNode);
        }
        return true;
    }

    public void add(int i, T data) {
        if (rootNode == null) { //if the rootnode is null, it'll set the rootNode to a value
            rootNode = new Node<>(data);
        } else { //if not, it'll make a new node and loop through until it gets to the bottom and set the newNode to the parent and initialize it with the data
            Node<T> newNode = new Node<>();
            while (newNode.getChildNode() != null) {
                newNode = newNode.getChildNode();
            }
            Node<T> newNode2 = new Node<>(newNode,null,data);
        }
    }

    public T remove (int i) {
        Node<T> newNode = rootNode;
        for (int n = 0; n < i; n++) {
            newNode = newNode.getChildNode(); //going to the index of i
        }
        T value = newNode.getValue(); //value to return when the node is removed
        Node <T> parentNode = newNode.getParentNode();
        Node<T> childNode = newNode.getChildNode();
        parentNode.setChildNode(childNode); //setting the node above index i to have it's child be the node below index i
        childNode.setParentNode(parentNode); //same as above just making sure >:D
        return value;
    }

    public T get (int i) {
        Node <T> newNode = rootNode;
            for (int n = 0; n < i; n++) {
                while (newNode.getChildNode() != null) { //while the child exists
                    newNode = newNode.getChildNode(); //setting newNode to it's child until it reaches index i
            }
        }
            return newNode.getValue(); //returning the value at i
    }

    public void set(int i, T data) {
        Node<T> newNode = new Node<>();
        for (int n = 0; n < i; n++) {
            if (newNode.getChildNode() != null) { //if the newnode child exists, it'll keep looping until it gets to the i value then it'll set the value at that point to "data"
                newNode = newNode.getChildNode();
            }
        }
        newNode.setValue(data);
    }

    public int size() {
        int n = 1;
        Node<T> newNode = rootNode;
        while (rootNode.getChildNode() != null) { //while the child exists, newnode loops through to the child node and increases n to the size of the arraylist and returns it
            newNode = newNode.getChildNode();
            n++;
        }
        return n;
    }
}

