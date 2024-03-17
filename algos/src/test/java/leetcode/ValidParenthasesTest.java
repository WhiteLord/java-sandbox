package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthasesTest {

    @Test
    void testSolution() {
        Assertions.assertTrue(ValidParenthases.isValid("{[()]}"));
        Assertions.assertFalse(ValidParenthases.isValid("{[{[{)"));
        Assertions.assertFalse(ValidParenthases.isValid("{)"));
        Assertions.assertFalse(ValidParenthases.isValid("(("));
        Assertions.assertFalse(ValidParenthases.isValid("]]"));
    }
}
