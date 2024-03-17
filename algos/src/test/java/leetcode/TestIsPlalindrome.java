package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIsPlalindrome {

    @Test
    void testIsPalindrome() {
        Assertions.assertTrue(IsPalindrome.isPalindrome(121));
        Assertions.assertTrue(IsPalindrome.isPalindrome(1221));
        Assertions.assertTrue(IsPalindrome.isPalindrome(12321));
        Assertions.assertFalse(IsPalindrome.isPalindrome(-121));
        Assertions.assertFalse(IsPalindrome.isPalindrome(10));
        Assertions.assertFalse(IsPalindrome.isPalindrome(123));
        Assertions.assertTrue(IsPalindrome.isPalindrome(0));
        Assertions.assertTrue(IsPalindrome.isPalindrome(7));
    }
}
