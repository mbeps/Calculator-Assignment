package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.*;

public class TestShuntingYard {
  // ^ Precedence Tests
  // Psychosomatic Complexity = 3 (minimum tests required)
  @Test
  void testGetPrecedenceAddition() { // Test 1
    /**
     * 1 - Method hardcoded to return 1 (pass)
     */
    assertEquals(1, ShuntingYard.getPrecedence('+'),
        "Test to see if the correct precedence is returned when sign is +");
  }

  @Test
  void testGetPrecedenceSubtraction() { // Test 2
    /**
     * 1 - Method hardcoded to return 1 (pass)
     */
    assertEquals(1, ShuntingYard.getPrecedence('-'),
        "Test to see if the correct precedence is returned when sign is -");
  }

  @Test
  void testGetPrecedenceMultiplication() { // Test 3
    /**
     * 1 - Method hardcoded to return 1 (fail)
     * 2 - Added if statement to detect sign (pass)
     */
    assertEquals(2, ShuntingYard.getPrecedence('*'),
        "Test to see if the correct precedence is returned when sign is *");
  }

  @Test
  void testGetPrecedenceDivision() { // Test 4
    /**
     * 1 - Method hardcoded to return 1 (fail)
     * 2 - Added if statement to detect sign (pass)
     */
    assertEquals(2, ShuntingYard.getPrecedence('/'),
        "Test to see if the correct precedence is returned when sign is /");
  }

  @Test
  void testGetPrecedencePower() { // Test 5
    /**
     * 1 - Method hardcoded to return 1 (fail)
     * 2 - Added if statement to detect sign (pass)
     */
    assertEquals(3, ShuntingYard.getPrecedence('^'),
        "Test to see if the correct precedence is returned when sign is ^");
  }

  @Test
  void testGetPrecedenceWrong() { // Test 6
    /**
     * 1 - Method hardcoded to return 1 (fail)
     * 2 - Added if statement to detect sign (pass)
     */
    assertEquals(-1, ShuntingYard.getPrecedence('d'),
        "Test to see if the correct precedence is returned when sign is not operator");
  }

  // ^ Converter
  // Psychosomatic Complexity = 6 (minimum tests required)
  @Test
  void testConverterLetterOrDigit() {
    /**
     * 1 - Hardcoded to return g (pass)
     */
    assertEquals("g", ShuntingYard.converter("g"));
  }

  @Test
  void testConverterLeftBracket() { // Test n-1
    /**
     * 1 - Hardcoded to return g (fail)
     * 2 - Add if statement to push into stack (pass)
     * 3 - Check to see it ( is not the last element in the stack (pass)
     */
    assertEquals("Invalid Expression", ShuntingYard.converter("("),
        "( cannot be the last element in an expression");
  }

  @Test
  void testConverterRightBracket() { // Test n-1
    /**
     * 1 - Hardcoded to return g (fail)
     * 2 - Add if statement to push into stack (pass)
     * 3 - Check to see it ( is not the last element in the stack (pass)
     * 4 - Add if statement to check bracket and increment to output (pass)
     * 5 - Check if the stack is not empty and last element is not ( (pass)
     */
    assertEquals("k", ShuntingYard.converter("(k)"),
        "Check if character is incremented to output");
  }

  @Test
  void testConverterRightBracketException() { // Test n-1
    /**
     * 1 - Hardcoded to return g (fail)
     * 2 - Add if statement to push into stack (pass)
     * 3 - Check to see it ( is not the last element in the stack (pass)
     * 4 - Add if statement to check bracket and increment to output (pass)
     * 5 - Check if the stack is not empty and last element is not ( (pass)
     */
    assertThrows(EmptyStackException.class, () -> ShuntingYard.converter(")"),
        "Check if EmptyStackException is thrown when popping empty stack");
  }

  @Test
  void testConverterOperands() { // Test n-1
    /**
     * 1 - Hardcoded to return g (fail)
     * 2 - Add if statement to push into stack (pass)
     * 3 - Check to see it ( is not the last element in the stack (pass)
     * 4 - Add if statement to check bracket and increment to output (pass)
     * 5 - Check if the stack is not empty and last element is not ( (pass)
     */
    assertEquals("+", ShuntingYard.converter("+"),
        "Test if operands are returned last in the output string");
  }

  @Test
  void testConverterFinalExpression() { // Test n
    /**
     * 1 - Run full expression (fail)
     * 2 - Add checks for brackets (pass)
     */
    assertEquals("5238-5^2^/+", ShuntingYard.converter("5+2/(3-8)^5^2"));
  }
}
