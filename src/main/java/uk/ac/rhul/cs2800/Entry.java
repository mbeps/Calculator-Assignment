package uk.ac.rhul.cs2800;

/**
 * Container class which contains types Float, String and Symbol.
 * 
 * @author Maruf
 */
public class Entry {
  private float number;
  private Symbol other;
  private String str;
  private Type type;

  // ^ Constructors:
  /**
   * Constructor initializes a new number entry object.
   * 
   * @param number (float): entry to be represented as number
   * @author Maruf
   */
  public Entry(float number) {
    this.number = number;
  }

  /**
   * Constructor initializes a new string entry object.
   * 
   * @param str (String): entry to be represented as string
   * @author Maruf
   */
  public Entry(String str) {
    this.str = str;
  }

  /**
   * Constructor initializes a new Symbol entry object.
   * 
   * @param other (Symbol): entry to be represented as symbol
   * @author Maruf
   */
  public Entry(Symbol other) {
    this.other = other;
  }

  // ^ Getters:
  /**
   * Returns the number of the entry object.
   * 
   * @return (float): number of entry
   * @author Maruf
   */
  public float getNumber() {
    return this.number;
  }

  /**
   * Returns the String of the entry object.
   * 
   * @return (String): string of entry
   * @author Maruf
   */
  public String getString() {
    return this.str;
  }

  /**
   * Returns the symbol of the entry object.
   * 
   * @return (Symbol): symbol of entry
   * @author Maruf
   */
  public Symbol getOther() {
    return this.other;
  }

  /**
   * Returns the type of the entry object.
   * 
   * @return (Type): type of entry
   * @author Maruf
   */
  public Type getType() {
    return this.type;
  }

  // ^ Setters:
  /**
   * Sets a new number of the entry object.
   * 
   * @param number (float): new number
   * @author Maruf
   */
  public void setNumber(float number) {
    this.number = number;
  }

  /**
   * Sets a new string of the entry object.
   * 
   * @param str (String): new number
   * @author Maruf
   */
  public void setString(String str) {
    this.str = str;
  }

  /**
   * Sets a new symbol of the entry object.
   * 
   * @param other (Symbol): new number
   * @author Maruf
   */
  public void setOther(Symbol other) {
    this.other = other;
  }

  /**
   * Sets a new type of the entry object.
   * 
   * @param type (Type): new type
   * @author Maruf
   */
  public void setType(Type type) {
    this.type = type;
  }

  /**
   * Overrides default implementation to check whether current object is equal to
   * object being passed for comparison.
   * 
   * @param obj (Object): object that is being compared with current object
   * @author Maruf
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) { // Current object and argument are the same objects
      return true;
    }
    if (getClass() != obj.getClass()) { // Different classes cannot be the same
      return false;
    }

    // Added from CS1812
    Entry other = (Entry) obj;
    // Check if the floating point
    if (Float.floatToIntBits(number) != Float.floatToIntBits(other.number)) {
      return false;
    }
    if (str == null) {
      if (other.str != null) {
        return false;
      }
    } else if (!str.equals(other.str)) {
      return false;
    }
    if (type != other.type) {
      return false;
    }
    return true;
  }

  /**
   * Overrides the default hash code method to determine unique hash code.
   * 
   * @return (int): hash code representation
   * @author Maruf
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Float.floatToIntBits(number);
    // Check if string is not null before working out the string hash
    result = prime * result + ((str == null) ? 0 : str.hashCode()); 
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
  }
}
