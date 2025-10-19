import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (ch == ')' && top != '(') return false;
                if (ch == ']' && top != '[') return false;
                if (ch == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "[()]{ }";
        String test2 = "()";
        String test3 = "()[]{}";
        String test4 = "(]";
        String test5 = "([)]";
        String test6 = "{[]}()";

        System.out.println(test1 + " : " + isValid(test1.replaceAll(" ", ""))); // true
        System.out.println(test2 + " : " + isValid(test2)); // true
        System.out.println(test3 + " : " + isValid(test3)); // true
        System.out.println(test4 + " : " + isValid(test4)); // false
        System.out.println(test5 + " : " + isValid(test5)); // false
        System.out.println(test6 + " : " + isValid(test6)); // true
    }
}
