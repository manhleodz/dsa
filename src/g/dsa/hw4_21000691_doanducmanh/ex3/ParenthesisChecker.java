package g.dsa.hw4_21000691_doanducmanh.ex3;

import java.util.Stack;

public class ParenthesisChecker {

    public static boolean isMatching(char open, char close) {
        if (open == '(' && close == ')') return true;
        if (open == '[' && close == ']') return true;
        if (open == '{' && close == '}') return true;
        return false;
    }

    public static boolean isValid(String expression) {

        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static int evaluateExpression(String expression) {
        if (!isValid(expression)) {
            throw new IllegalArgumentException("Invalid expression.");
        }

        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                int operand = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    operand = operand * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                operandStack.push(operand);
            } else if (c == '(') {
                operatorStack.push(c);
            } else if (c == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    performOperation(operandStack, operatorStack);
                }
                operatorStack.pop();
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operatorStack.isEmpty() && precedence(c) <= precedence(operatorStack.peek())) {
                    performOperation(operandStack, operatorStack);
                }
                operatorStack.push(c);
            }
        }

        while (!operatorStack.isEmpty()) {
            performOperation(operandStack, operatorStack);
        }

        return operandStack.pop();
    }

    private static void performOperation(Stack<Integer> operandStack, Stack<Character> operatorStack) {
        char operator = operatorStack.pop();
        int operand2 = operandStack.pop();
        int operand1 = operandStack.pop();
        int result = 0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
        }

        operandStack.push(result);
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }


    public static void main(String[] args) {

        // Test a
        String[] expressions = {"(a − b) ∗ (c + d)", "(10 + 8)/(5 - 2) * 17", "(a + b) * c - d)", "(10- 8 / ((2 + 5) * 17)", ")u - v) * (m + n)"};
        for (String expression : expressions) {
            System.out.println(expression + " is " + (isValid(expression) ? "valid" : "invalid"));
        }
        System.out.println();

        // Test b
        String[] expressions2 = {"(1 + ((2 + 3) * (8 * 5)))", "(5 - (8 - 4) * (2 + 3)) + (8 / 4)"};
        for (String expression : expressions2) {
            System.out.println(expression + " is " + (isValid(expression) ? "valid" : "invalid"));
            if ((isValid(expression) ? "valid" : "invalid") == "valid") {
                System.out.println("Result: " + evaluateExpression(expression));
            }
        }

    }
}
