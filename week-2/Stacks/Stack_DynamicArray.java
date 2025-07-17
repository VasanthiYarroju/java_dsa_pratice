import java.util.ArrayList;

public class Stack_DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> s=new ArrayList<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        //pop the element from the stack
        System.out.println(s.remove(s.size()-1)+" poped from the stack");
        //use the peek and get the top element from the stack
        System.out.println(s.get(s.size()-1)+" peeked from the stack");
        System.out.println("elements in the stack are");
        while(!s.isEmpty()){
            System.out.print(s.get(s.size()-1)+" ");
            s.remove(s.size()-1);
        }

    }
}
