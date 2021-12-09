package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestPostfixEvaluation {
    PostfixEvaluation foo;
    @BeforeEach
    void setup() {
        foo = new PostfixEvaluation();
    }
    
    @Test
    void testEvaluateAddition() { // Test 2
        /**
         * 1 - Failed as index position was miscalculated 
         * 2 - Index position fixed (pass)
         */
        foo.pushOperand(5);
        foo.pushOperand(4);

        foo.pushOperator("+");

        assertEquals(9, foo.evaluate());
    }

    @Test
    void testEvaluateSubtraction() { // Test 3
        /**
         * 1 - Failed as index position was miscalculated 
         * 2 - Index position fixed (pass)
         */
        foo.pushOperand(3);
        foo.pushOperand(8);

        foo.pushOperator("-");

        assertEquals(5, foo.evaluate());
    }
    @Test
    void testEvaluateMultiplication() { // Test 4
        /**
         * 1 - Failed as index position was miscalculated 
         * 2 - Index position fixed (pass)
         */
        foo.pushOperand(5);
        foo.pushOperand(4);

        foo.pushOperator("*");

        assertEquals(20, foo.evaluate());
    }

    @Test
    void testEvaluateDivision() { // Test 5
        /**
         * 1 - Failed as index position was miscalculated 
         * 2 - Index position fixed (pass)
         */
        foo.pushOperand(4);
        foo.pushOperand(8);

        foo.pushOperator("/");

        assertEquals(2, foo.evaluate());
    }
    
    @Test
    void testEvaluate() { // Test 1
        /**
         * 1 - Full algorithm required for testing (fail)
         * 2 - Other smaller tests written to find fault (pass)
         */
        foo.pushOperand(5);
        foo.pushOperand(4);
        foo.pushOperand(2);

        foo.pushOperator("*");
        foo.pushOperator("+");

        assertEquals(13, foo.evaluate());
    }
}
