package s019;

import common.ListNode;

/**
 * @author : LinkinStar
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = new ListNode(-1);
        ListNode fast = new ListNode(-1);
        slow.next = head;
        fast.next = head;
        while (n-- != -1) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = ListNode.createList("1,2,3,4,5");
        ListNode result = solution.removeNthFromEnd(head, 2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
