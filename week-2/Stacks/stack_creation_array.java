public class stack_creation_array {
    int top,cap;
    int[] arr;
    public stack_creation_array(int cap){
        this.cap=cap;
        top=-1;
        arr=new int[cap];
    }
    public boolean push(int x){
        if(top>cap-1){
            System.out.println("stack overfloe]w");
            return false;
        }
        arr[++top]=x;
        return true;
    }
    public int pop(){
        if(top<0){
            System.out.println("stacl underflow");
            return -1;
        }
        return arr[top--];
    }
    public int peek(){
        if(top<0){
            System.out.println("stack isempty");
            return 0;
        }
       return arr[top];
    }
    public boolean isEmpty(){
        return top<0;
    }
    public static void main(String[] args){
        stack_creation_array s=new stack_creation_array(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.pop()+" poped from stack");
        System.out.println(s.peek()+" peeked from stack");
        System.out.println(s.push(40)+" pushed into  stack");
        System.out.println(" elements in the stack are");
        while (!s.isEmpty()) { 
            System.out.print(s.peek() + " "); 
            s.pop(); 
        }

    }

}
