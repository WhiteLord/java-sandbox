package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    @Test
    void test(){
        Assertions.assertTrue(LongestCommonPrefix.longestCommonPrefix(new String[]{"farbe", "fatma", "fatmarlak"}).equals("fa"));
        Assertions.assertTrue(LongestCommonPrefix.longestCommonPrefix(new String[]{"nexusi", "kaliber", "ibar"}).equals("i"));
    }
}
