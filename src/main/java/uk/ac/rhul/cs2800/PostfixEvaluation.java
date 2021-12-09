package uk.ac.rhul.cs2800;

public class PostfixEvaluation {
    private Stack<Integer> operandStack;
    private Stack<String> operatorStack;

    public PostfixEvaluation() {
        this.operandStack = new Stack<>();
        this.operatorStack = new Stack<>();
    }

    public void pushOperand(int payload) {
        this.operandStack.push(payload);
    }

    public void pushOperator(String payload) {
        this.operatorStack.push(payload);
    }

    public float evaluate() {
        float result = operandStack.getIndexItem(operandStack.size() - 1);
        for (int i = 0; i < operandStack.size() - 1; i++) {
            int operand = operandStack.getIndexItem(operandStack.size() - 2 - i);
            String operator = operatorStack.getIndexItem(i);

            switch(operator) {
                case "+":
                    result = result + operand;
                    break;
                case "-":
                    result = result - operand;
                    break;
                case "*":
                    result = result * operand;
                    break;
                case "/":
                    result = result / operand;
                    break;
            }
        }
        return result;
    }

}
