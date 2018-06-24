package s021;

import common.ListNode;

/**
 * @author : LinkinStar
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode cur = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if (l1 != null) {
            cur.next = l1;
        } else {
            cur.next = l2;
        }
        return result.next;
    }

    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listOne = ListNode.createList("1,2,4");
        ListNode listTwo = ListNode.createList("1,3,4");
        ListNode result = solution.mergeTwoLists(listOne, listTwo);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
