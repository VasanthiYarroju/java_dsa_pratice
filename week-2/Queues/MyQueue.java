import java.util.Stack;

public class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Peek: " + queue.peek()); // 10
        System.out.println("Pop: " + queue.pop());   // 10
        System.out.println("Peek: " + queue.peek()); // 20
        System.out.println("Empty: " + queue.empty()); // false

        queue.pop(); // removes 20
        queue.pop(); // removes 30

        System.out.println("Empty after pops: " + queue.empty()); // true
    }
}
