package s002;

import common.ListNode;

/**
 * @author LinkinStar
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int flag = 0;
        while (l1 != null || l2 != null) {
            int temp = flag;
            if (l1 != null) {
                temp += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                temp += l2.val;
                l2 = l2.next;
            }
            flag = temp / 10;
            cur.next = new ListNode(temp % 10);
            cur = cur.next;
        }

        if (flag > 0) {
            cur.next = new ListNode(flag);
        }
        return dummy.next;
    }

    /**
     * test case
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = ListNode.createList("2,4,3");
        ListNode l2 = ListNode.createList("5,6,4");
        ListNode result = solution.addTwoNumbers(l1, l2);
        ListNode.printList(result);
    }
}
