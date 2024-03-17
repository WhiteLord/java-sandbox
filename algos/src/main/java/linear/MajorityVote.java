package linear;

import generators.RandomNumberGenerator;

import java.util.List;

/**
 * Problem: Based on an array of items, find the majority of items
 * Condition: Use time complexity O(n) and constant space complexity O(1)
 */
public class MajorityVote {

    public static void main(String... args) {
        final List<Integer> integerArray = new RandomNumberGenerator().generateList(1, 50, 100);
        Integer solution = MajorityVote.findMajorityInteger(integerArray);
        System.out.println("Majority number: " + solution);
    }

    private static Integer findMajorityInteger(final List<Integer> inputList) {
        boolean isInitialized = false;
        int majorityNum = 0,
                  count = 0;
       for (final Integer entry: inputList) {
           if (!isInitialized) {
               majorityNum = entry;
               count = 1;
               isInitialized = true;
           } else {
               if (count > 0) {
                   if (majorityNum != entry) {
                       count --;
                   }
               } else if (count == 0) {
                   majorityNum = entry;
                   count ++;
               }
           }
       }
        return majorityNum;
    }
}
