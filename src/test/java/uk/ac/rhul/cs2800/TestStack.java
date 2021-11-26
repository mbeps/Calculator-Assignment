package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.*;

class TestStack {
  /**
   * 1 - Originally primitive, made the tests generic as the stack class has been
   * made generic
   */
  private Stack<Integer> testStack;

  @BeforeEach
  public void setup() { // Test 1
    /**
     * New stack initialized with no arguments
     */
    testStack = new Stack<Integer>();
  }

  @Test
  void testSizeEqualsZero() { // Test 2
    /**
     * 1 - Return hardcoded to 0 2 - Private variable size implemented. Replaced
     * with array 3 - Function tracks size of Array, Fail since array is fixed size
     * 4 - Function tracks size ArrayList which is dynamic do no fail
     */
    assertEquals(testStack.size(), 0, "Check if size equals 0");
  }

  @Test
  void testIsEmptyTrue() { // Test 9
    /**
     * 1 - Checking whether stack is empty is commonly used therefore a new method
     * created
     */
    assertEquals(testStack.isEmpty(), true, "Check if stack is empty");
  }

  @Test
  void testIsEmptyFalse() { // Test 10
    testStack.push(5);
    assertEquals(testStack.isEmpty(), false, "Check if stack is not empty");
  }

  @Test
  void testPush() { // Test 3
    /**
     * 1 - Hard coding the value to return 1 2 - Implemented array but not mutable
     * so size set was returned (incorrect) 3 - Implementing ArrayList to store
     * dynamic amount of data and generic (correct size returned) 4 - size() changed
     * to work out the index
     */
    testStack.push(5);
    assertEquals(testStack.size(), 1, "Check if data has been added to stack");
  }

  @Test
  void testBigPush() { // Test 4
    /**
     * 1 - Implementations functions as expected without any modifications
     */
    int[] testPayload = { 5, 3, 4, 8, 6 };

    for (int i : testPayload) { // Adding elements of test array into stack
      testStack.push(i);
    }

    assertEquals(testStack.size(), 5, "Check if 5 elements have been added to stack");
  }

  @Test
  void testPop() { // Test 5
    /**
     * 1 - Data cannot be popped if there is no data in the stack 2 - Implemented
     * check to see if the stack is empty 3 - Added exception
     */
    testBigPush(); // Call method which adds 5 elements to the stack
    testStack.pop();
    assertEquals(testStack.size(), 4, "Check if data has been removed to stack");
  }

  @Test
  void testBigPop() { // Test 5
    /**
     * 1 - Check if multiple items can be popped at once 2 - If too many items are
     * popped, exception is thrown
     */
    int[] testPayload = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    for (int i : testPayload) {
      testStack.push(i);
    }

    for (int i = 1; i < 4; i++) {
      testStack.pop();
    }

    assertEquals(testStack.size(), 6, "Check if 3 elements have been removed to stack");
  }

  @Test
  void testEmptyPop() { // Test 6
    /**
     * 1 - Pop functions until the size of stack is less than 0 2 -
     * ArrayIndexOutOfBounds thrown (undesired exception) 3 - Check if stack is
     * empty, throw desired exception
     */

    assertThrows(EmptyStackException.class, () -> testStack.pop(),
        "Check if EmptyStackException is thrown when popping empty stack");
  }

  @Test
  void testTop() { // Test 7
    /**
     * 1 - Check to see if last element in the stack is returned, no hard coding
     * required
     */
    int[] testData = { 3, 5, 1, 8, 2, 3, 9 };

    for (int i : testData) {
      testStack.push(i);
    }

    assertEquals(testStack.top(), 9, "Check if last element from stack is returned");
  }

  @Test
  void testEmptyTop() { // Test 8
    /**
     * 1 - ArrayIndexOutOfBounds returned (undesired exception) 2 - Add check to see
     * if the stack is empty
     */
    assertThrows(EmptyStackException.class, () -> testStack.top(),
        "Check if EmptyStackException is thrown when returning last element from empty stack");
  }

  @Test
  void pushGeneric() { // Test 11
    /**
     * 1 - Different constructors for each type 2 - Generic types not supported
     * (Fail to compile) 3 - Initially, only supported primitive int
     */
    Stack<Object> genericTestStack = new Stack<Object>(); // New generic object class to test if any generic type can be
                                                          // passed
    Object genericPayload = new Object();
    genericTestStack.push(genericPayload);
    assertEquals(genericTestStack.isEmpty(), false, "Check if stack supports generic types");
  }

  @Test
  void pushString() { // Test 12
    Stack<String> stringTestStack = new Stack<String>(); // New generic object class to test if any generic type can be
                                                         // passed
    String stringPayload = new String();
    stringTestStack.push(stringPayload);
    assertEquals(stringTestStack.isEmpty(), false, "Check if stack supports string types");
  }

  @Test
  void genericOperationsTestSummary() {
    // 1 - Whether all the operations that worked with primitive type also work with
    // generic types
    Stack<Object> genericTestStack = new Stack<Object>();
    Object genericPayload = new Object();

    genericTestStack.push(genericPayload);
    genericTestStack.push("String payload");
    genericTestStack.push(3);
    genericTestStack.pop();
    assertEquals(genericTestStack.size(), 2, "Check if generic elements can be pushed and popped");
  }

}
