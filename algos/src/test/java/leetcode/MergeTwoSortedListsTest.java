package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {

    @Test
    public void testCase() {
        MergeTwoSortedLists.ListNode one = new MergeTwoSortedLists.ListNode(1, new MergeTwoSortedLists.ListNode(2, new MergeTwoSortedLists.ListNode(3)));
        MergeTwoSortedLists.ListNode two = new MergeTwoSortedLists.ListNode(1, new MergeTwoSortedLists.ListNode(2, new MergeTwoSortedLists.ListNode(2, new MergeTwoSortedLists.ListNode(4))));


        MergeTwoSortedLists.ListNode solution = new MergeTwoSortedLists.ListNode(1,
                new MergeTwoSortedLists.ListNode(1,
                        new MergeTwoSortedLists.ListNode(2,
                                new MergeTwoSortedLists.ListNode(2,
                                        new MergeTwoSortedLists.ListNode(2,
                                                new MergeTwoSortedLists.ListNode(3,
                                                        new MergeTwoSortedLists.ListNode(4)))))));

        Assertions.assertEquals(MergeTwoSortedLists.mergeTwoLists(one, two).val, solution.val);
        Assertions.assertEquals(MergeTwoSortedLists.mergeTwoLists(one, two).next.val, solution.next.val);
    }
}
