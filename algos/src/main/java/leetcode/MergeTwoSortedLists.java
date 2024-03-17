package leetcode;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode target = new ListNode(-200);
       ListNode pointer = target;

       while (list1 != null && list2 != null) {
           if (list1.val < list2.val) {
               pointer.next = new ListNode(list1.val);
               list1 = list1.next;
           } else {
               pointer.next = new ListNode(list2.val);
               list2 = list2.next;
           }
           pointer = pointer.next;
       }

       if (list1 != null) {
           pointer.next = list1;
       } else {
           pointer.next = list2;
       }
       return target.next;
    }

}
