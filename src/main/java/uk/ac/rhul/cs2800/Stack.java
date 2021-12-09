package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Stack class which stores types of data in a certain order. First item added
 * to the stack is the last item out. Generic class hence any type can be
 * passed.
 * 
 * @author Maruf
 */
public class Stack<T> {
  /**
   * Data stored in a mutable array (ArrayList) where multiple objects can be
   * stored without set amount. Takes generic type hence any type of object can be
   * stored. Index used to locate items.
   */
  private ArrayList<T> dataStack;

  /**
   * Constructor initiates a new stack objects.
   * 
   * @author Maruf
   */
  public Stack() {
    this.dataStack = new ArrayList<T>();
  }

  /**
   * Computes the size of the stack.
   * 
   * @return (int): size of the stack
   * @author Maruf
   */
  public int size() {
    return (dataStack.size()); // Stack is the same size as the ArrayList
  }

  /**
   * Checks whether or not the the stack is empty.
   * 
   * @return (boolean): whether the stack is empty or not
   * @author Maruf
   */
  public boolean isEmpty() {
    return (dataStack.size() <= 0); // Stack is empty when its size is 0 or less
  }

  /**
   * Adds data into stack. Takes any generic type of data. There is no size limit
   * to the amount of data that can be added. Other limitations may exist.
   * 
   * @param payload (T): data to be added to the stack
   * @author Maruf
   */
  public void push(T payload) {
    dataStack.add(payload);
  }

  /**
   * Removes the last item from the stack if it is not empty.
   * 
   * @throws EmptyStackException if the stack is empty
   * @author Maruf
   */
  public void pop() throws EmptyStackException {
    if (dataStack.isEmpty()) {
      throw new EmptyStackException();
    } else {
      dataStack.remove(dataStack.size() - 1);
    }
  }

  /**
   * If the stack is not empty, the last item is returned. If no items exist in
   * the stack, then an exception is thrown.
   * 
   * @return (int): returns the last item in the stack
   * @throws EmptyStackException if the stack is empty
   * @author Maruf
   */
  public T top() throws EmptyStackException {
    if (dataStack.isEmpty() == false) {
      return (dataStack.get(dataStack.size() - 1));
    } else {
      throw new EmptyStackException();
    }
  }

  /**
   * Returns the element from specific index position. 
   * Method only returns item from the stack if it is not empty. 
   * @param index (int): position of item to be returned
   * @return (T): element in the desired position
   * @author Maruf
   */
  public T getIndexItem(int index) {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    else {
      return dataStack.get(index);
    }
  }

}
