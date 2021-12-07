package uk.ac.rhul.cs2800;

import java.lang.Character;

/**
 * Implements Shunting Yard algorithm. 
 * Converts infix expression to postfix expression. 
 */
public class ShuntingYard {
  private static Stack<Character> stack;

  /**
   * Check whether character passed is a letter or digit.
   * Symbols do count as letter or digit.
   * 
   * @param character (char): character to be checked
   * @return (boolean): whether character is letter / digit
   * @author Maruf
   */
  static boolean isLetterOrDigit(char character) {
    return Character.isLetterOrDigit(character);
  }

  /**
   * Orders sign by precedence.
   * Higher precedence returns higher value.
   * 
   * @param sign (char): sign to be tested for precedence
   * @return (int): precedence of the sign
   * @author Maruf
   */
  public static int getPrecedence(char sign) {
    if (sign == '+' || sign == '-') {
      return 1;
    } else if (sign == '*' || sign == '/') {
      return 2;
    } else if (sign == '^') {
      return 3;
    }
    return -1;
  }

  /**
   * Converts infix notation to postfix notation
   * 
   * @param expression (String): expression to be converted
   * @return (String): converted postfix expression
   * @author Maruf
   */
  public static String converter(String expression) {
    stack = new Stack<>();
    String output = "";

    // Iterate over tokens in the expression
    for (int i = 0; i < expression.length(); ++i) {
      char characterAtIndex = expression.charAt(i); // I-th character
      // Operand added to output
      if (isLetterOrDigit(characterAtIndex)) {
        output += characterAtIndex;
      }
      // Push '(' to stack
      else if (characterAtIndex == '(') {
        stack.push(characterAtIndex);
      }
      // Pop ')' and append to output from stack until '('
      else if (characterAtIndex == ')') {
        // Only when the stack is not empty and the last element is not (
        while (!stack.isEmpty() && stack.top() != '(') {
          output += stack.top();
          stack.pop();
        }
        stack.pop();
      } else { // Operands
        while (!stack.isEmpty() && getPrecedence(characterAtIndex) <= getPrecedence(stack.top())) {
          output += stack.top();
          stack.pop();
        }
        stack.push(characterAtIndex);
      }
    }

    // Pop all the remaining operators from the stack and append them to output
    while (!stack.isEmpty()) {
      if (stack.top() == '(') {
        return "Invalid Expression";
      }
      output += stack.top();
      stack.pop();
    }
    return output;
  }
}
