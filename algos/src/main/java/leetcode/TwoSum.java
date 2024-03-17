package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class TwoSum {

    public static void main (String... args) {
    }

    public static int[] twoSum(int[] nums, int target) {
//        for (int i=0; i < nums.length; i++) {
//            for (int j=i+1; j < nums.length; j++) {
//                    if (nums[i] + nums[j] == target) {
//                        return new int[]{i, j};
//                    }
//            }
//        }
//        return null;
        Map<Integer, Integer> container = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (container.containsKey(target - nums[i])) {
                return new int[] {container.get(target-nums[i]), i};
            }
            container.put(nums[i], i);
        }
        return null;
    }
}
