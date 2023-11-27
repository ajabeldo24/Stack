//Stack
//Author: Ahmed Jabeldo
//Date: 11/17/23
//Collaborators: Luke O'Drobinak, Juan Pablo Sanchez-Espino

public class StackNode<T> {
    //variables
    private T Data; //creating instance data and a child node
    private StackNode<T> child;

    //constructors
    public StackNode() { //empty constructor

    }

    public StackNode(T Data) { //constructor with data
        this.Data = Data;
    }

    public StackNode(StackNode<T> child, T Data) { //constructor with child node and data
        this.child = child;
        this.Data = Data;
    }

    //Methods and accessors
    public T getData() { //data accessor method
        return this.Data;
    }

    public void setData(T Data) { //mutator for the data
        this.Data = Data;
    }

    public StackNode<T> getChild () { //child accessor method
        return this.child;
    }

    public void setChild (StackNode<T> child) { //child mutator method
        this.child = child;
    }

    //other methods
    public String toString () {
        String datasout = " " + Data;
        String childsout = " " + child;
        return "Data: " + datasout + " Child: " + childsout;
    }
}
