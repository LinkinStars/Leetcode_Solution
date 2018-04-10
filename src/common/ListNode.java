package common;

/**
 * linked list node
 * @author LinkinStar
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    /**
     * create a list to test
     * @param data 1,2,3
     * @return 1->2->3->null
     */
    public static ListNode createList(String data){
        if (data == null || data.length() == 0) {
            return null;
        }
        String[] dataArr = data.split(",");
        ListNode[] listNodes = new ListNode[dataArr.length];
        listNodes[0] = new ListNode(Integer.valueOf(dataArr[0]));
        for (int i = 1; i < dataArr.length; i++) {
            listNodes[i] = new ListNode(Integer.valueOf(dataArr[i]));
            listNodes[i - 1].next = listNodes[i];
        }
        listNodes[dataArr.length - 1].next = null;
        return listNodes[0];
    }

    /**
     * print the list
     * @param root the head of a list
     * 1, 2, 3, null
     */
    public static void printList(ListNode root){
        while (root != null) {
            System.out.print(root.val);
            System.out.print(", ");
            root = root.next;
        }
        System.out.println("null");
    }
}
