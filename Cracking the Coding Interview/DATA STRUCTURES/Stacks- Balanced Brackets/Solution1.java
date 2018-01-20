import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> schar = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char temp = expression.charAt(i);
            if (temp == '{' || temp == '(' || temp == '[') {
                schar.push(temp);
            } else if (!schar.isEmpty() && ((temp == ')' && schar.peek() == '(') ||
                    (temp == '}' && schar.peek() == '{') ||
                    (temp == ']' && schar.peek() == '['))) {
                schar.pop();
            } else {
                return false;
            }
        }
        return schar.isEmpty();    
        
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
