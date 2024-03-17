package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    @ParameterizedTest
    @MethodSource("testCases")
    public void testTwoSum(int[] nums, int target, int[] expected) {
        assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }

    static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{new int[]{2, 7, 0, 1}, 9, new int[]{0, 1}},
                new Object[]{new int[]{5, 15, 1, 3}, 16, new int[]{1, 2}},
                new Object[]{new int[]{1, 2, 3, 4}, 7, new int[]{2, 3}},
                new Object[]{new int[]{10, 15, 17, 40}, 50, new int[]{0, 3}},
                new Object[]{new int[]{3,2,4}, 6, new int[]{1,2}}
        );
    }
}
