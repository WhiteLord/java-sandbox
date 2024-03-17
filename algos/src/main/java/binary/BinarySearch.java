package binary;

import generators.RandomNumberGenerator;
import java.util.List;


/**
 * Problem: Given a sorted array of items, find a sample element
 * Condition: Use time complexity O(n) and constant space complexity O(1)
 */
public class BinarySearch {

    public static void main(String... args) {
        List<Integer> items = new RandomNumberGenerator().generateList(1, 200, 100);
    }
}
