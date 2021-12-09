package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestPostfixEvaluation {
    @Test
    void testEvaluate() {
        PostfixEvaluation foo = new PostfixEvaluation();
        foo.pushOperand(5);
        foo.pushOperand(4);
        foo.pushOperand(2);

        foo.pushOperator("*");
        foo.pushOperator("+");

        assertEquals(13, foo.evaluate());
    }

    @Test
    void testEvaluate2() {
        PostfixEvaluation foo = new PostfixEvaluation();
        foo.pushOperand(7);
        foo.pushOperand(6);
        foo.pushOperand(3);

        foo.pushOperator("/");
        foo.pushOperator("-");

        assertEquals(5, foo.evaluate());
    }
}
