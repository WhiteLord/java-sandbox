package linear.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionTest {

    @Test
    public void test() {
        int [] real = {6,7,8,9,4,5,3,2,1};
        int [] sorted = {1,2,3,4,5,6,7,8,9};
        Assertions.assertArrayEquals(Insertion.sort(real), sorted);
    }
}
