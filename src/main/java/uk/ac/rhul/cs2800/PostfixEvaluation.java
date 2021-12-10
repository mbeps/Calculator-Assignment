package uk.ac.rhul.cs2800;

/**
 * Contains implementation used to evaluate a postfix expression.
 */
public class PostfixEvaluation {
  private Stack<Integer> operandStack;
  private Stack<String> operatorStack;

  /**
   * Empty constructor initializes object.
   * 
   * @author Maruf
   * 
   */
  public PostfixEvaluation() {
    this.operandStack = new Stack<>();
    this.operatorStack = new Stack<>();
  }

  /**
   * Push operands into the stack.
   * 
   * @param payload (int): operands to be pushed into stack
   * @author Maruf
   */
  public void pushOperand(int payload) {
    this.operandStack.push(payload);
  }

  /**
   * Push operators into the stack.
   * 
   * @param payload (String): operators to be pushed into stack
   * @author Maruf
   */
  public void pushOperator(String payload) {
    this.operatorStack.push(payload);
  }

  /**
   * Evaluates answer to postfix expression given stack.
   * Once the items are in the stack, the algorithm can solve the expression.
   * Separate algorithm required to transfer expression into stacks.
   * 
   * @return (float): answer
   * @author Maruf
   * 
   */
  public float evaluate() {
    float result = operandStack.getIndexItem(operandStack.size() - 1);
    for (int i = 0; i < operandStack.size() - 1; i++) {
      int operand = operandStack.getIndexItem(operandStack.size() - 2 - i);
      String operator = operatorStack.getIndexItem(i);

      switch (operator) {
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
        default:
          break;
      }
    }
    return result;
  }

}
