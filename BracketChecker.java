import java.util.*;

public class BracketChecker {

    public static boolean areBracketsClosed(String input) {
        Stack<Character> stack = new Stack<>();
        for(Character c : input.toCharArray()) {
            if(c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if(c == ')' || c == ']' || c == '}'){
                if(stack.isEmpty()) {
                    return false;
                } 
                char top = stack.pop();
                if((c=='}' && top != '{') ||
                (c==']' && top != '[') ||
                (c==')' && top != '(')) {
                    return false;
                }
                
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println("Are brackets closed? " + areBracketsClosed(input)); // true

        String invalidInput = "{[()}";
        System.out.println("Are brackets closed? " + areBracketsClosed(invalidInput)); // false
    }
}
