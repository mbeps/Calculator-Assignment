package uk.ac.rhul.cs2800;

/**
 * Represents constants for different types of symbols that can be used in a
 * calculator. Each enum may have a different function.
 * 
 * @author Maruf
 */
enum Symbol {
  LEFT_BRACKET {
    /**
     * String representation of the left bracket.
     * 
     * @author Maruf
     */
    public String toString() {
      return ("(");
    }
  },
  RIGHT_BRACKET {
    /**
     * String representation of the right bracket.
     * 
     * @author Maruf
     */
    public String toString() {
      return (")");
    }
  },
  TIMES {
    /**
     * String representation of the times sign.
     * 
     * @author Maruf
     */
    public String toString() {
      return ("×");
    }
  },
  DIVIDE {
    /**
     * String representation of the divide sign.
     * 
     * @author Maruf
     */
    public String toString() {
      return ("÷");
    }
  },
  PLUS {
    /**
     * String representation of the plus sign.
     * 
     * @author Maruf
     */
    public String toString() {
      return ("+");
    }
  },
  MINUS {
    /**
     * String representation of the minus sign.
     * 
     * @author Maruf
     */
    public String toString() {
      return ("-");
    }
  },
  INVALID {
    /**
     * String representation of an invalid symbol.
     * 
     * @author Maruf
     */
    public String toString() {
      return ("Invalid");
    }
  },

}
