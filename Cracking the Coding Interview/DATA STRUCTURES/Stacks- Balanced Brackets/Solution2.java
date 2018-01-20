package Own;

import java.util.Scanner;

public class BalancedParanthesesUsingStack {

    private static Node top;

    class Node {
        private Character element;
        private Node next = null;

        Node(char data) {
            element = data;
            next = null;
        }
    }

    public void pushElement(char element) {
        Node new_node = new Node(element);
        if (top == null) {
            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;
        }
    }

    public char popElement() {
        if (top == null) {
            //Stack is empty
            return '\0';
        } else {
            char temp = top.element;
            top = top.next;
            return temp;
        }
    }

    public static boolean isBalanced(String expression) {
        BalancedParanthesesUsingStack obj = new BalancedParanthesesUsingStack();

        for (int i = 0; i < expression.length(); i++) {
            char temp = expression.charAt(i);
            if (temp == '{' || temp == '(' || temp == '[') {
                obj.pushElement(temp);
            } else if (top!=null && ((temp == ')' && top.element == '(') ||
                    (temp == '}' && top.element == '{') ||
                    (temp == ']' && top.element == '['))) {
                obj.popElement();
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }


}
