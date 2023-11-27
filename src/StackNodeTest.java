public class StackNodeTest {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<Integer>(); //new Stack
        System.out.println(stack.isEmpty()); //should return true
        stack.push(1); //adding 3 things of data
        stack.push(2);
        stack.push(3);
        System.out.println(stack.size()); //should return 3
        System.out.println(stack.peek()); //looking at top node
        stack.pop(); //popping out the top node
        System.out.println(stack.isEmpty()); //should hopefully return false
        stack.pop();
        stack.pop(); //popping out the rest of the nodes
        System.out.println(stack.isEmpty()); //should return true
    }
}
