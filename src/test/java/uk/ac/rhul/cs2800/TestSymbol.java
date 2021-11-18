package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class TestSymbol {
  @Test
  void testSymbolLeftBracket() {
    /**
     * 1 - Created Entry class, with enum symbols and added left bracket (fail) 2 -
     * Added toString implementation (pass) 3 - Added all other symbols and toString
     * implementation
     */
    assertEquals(Symbol.LEFT_BRACKET.toString(), "(", "Check if left bracket is sign returned correctly");
  }

  @Test
  void testSymbolRightBracket() {
    assertEquals(Symbol.RIGHT_BRACKET.toString(), ")", "Check if right bracket sign is returned correctly");
  }

  @Test
  void testSymbolTimes() {
    assertEquals(Symbol.TIMES.toString(), "×", "Check if times is returned correctly correctly");
  }

  @Test
  void testSymbolDivide() {
    assertEquals(Symbol.DIVIDE.toString(), "÷", "Check if division sign is returned correctly");
  }

  @Test
  void testSymbolPlus() {
    assertEquals(Symbol.PLUS.toString(), "+");
  }

  @Test
  void testSymbolMinus() {
    assertEquals(Symbol.MINUS.toString(), "-");
  }

  @Test
  void testSymbolInvalid() {
    /**
     * 1 - Check if the invalid is detected, very rudimentary (pass) 2 - Check if
     * the other symbols are not used (not implemented)
     */
    assertEquals(Symbol.INVALID.toString(), "Invalid");
  }
}
