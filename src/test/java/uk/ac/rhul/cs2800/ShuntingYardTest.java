package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ShuntingYardTest {
  @Test
  void testGetPrecedenceAddition() { // Test 1
    /**
     * 1 - Method hardcoded to return 1 (pass)
     */
    assertEquals(1, ShuntingYard.getPrecedence('+'), "Test to see if the correct precedence is returned when sign is +");
  }

  @Test
  void testGetPrecedenceSubtraction() { // Test 2
    /**
     * 1 - Method hardcoded to return 1 (pass)
     */
    assertEquals(1, ShuntingYard.getPrecedence('-'), "Test to see if the correct precedence is returned when sign is -");
  }

  @Test
  void testGetPrecedenceMultiplication() { // Test 3
    /**
     * 1 - Method hardcoded to return 1 (fail)
     * 2 - Added if statement to detect sign (pass)
     */
    assertEquals(2, ShuntingYard.getPrecedence('*'), "Test to see if the correct precedence is returned when sign is *");
  }

  @Test
  void testGetPrecedenceDivision() { // Test 3
    /**
     * 1 - Method hardcoded to return 1 (fail)
     * 2 - Added if statement to detect sign (pass)
     */
    assertEquals(2, ShuntingYard.getPrecedence('/'), "Test to see if the correct precedence is returned when sign is /");
  }

  @Test
  void testGetPrecedencePower() { // Test 3
    /**
     * 1 - Method hardcoded to return 1 (fail)
     * 2 - Added if statement to detect sign (pass)
     */
    assertEquals(3, ShuntingYard.getPrecedence('^'), "Test to see if the correct precedence is returned when sign is ^");
  }

  @Test
  void testGetPrecedenceWrong() { // Test 3
    /**
     * 1 - Method hardcoded to return 1 (fail)
     * 2 - Added if statement to detect sign (pass)
     */
    assertEquals(-1, ShuntingYard.getPrecedence('d'), "Test to see if the correct precedence is returned when sign is /");
  }
}
