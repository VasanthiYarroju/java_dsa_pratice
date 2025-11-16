import java.util.*;
public class Reverse_Polish_Notation {
    public static  int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                int result=0;
                switch(token){
                    case "+":
                        result=a+b;
                        break;
                    case "-":
                        result=a-b;
                        break;
                    case "*":
                        result=a*b;
                        break;
                    case "/":
                        result=a/b;
                        break;
                }
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args){
        String[] tokens={"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
}
