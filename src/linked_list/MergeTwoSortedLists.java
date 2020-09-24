package linked_list;

public class MergeTwoSortedLists {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode node = null, prev = null;
    ListNode head = null;
    while(l1 != null || l2 != null ) {
      if(l1 != null && l2 != null) {
        if(l1.val < l2.val) {
          node = new ListNode(l1.val);
          l1 = l1.next;
        } else {
          node = new ListNode(l2.val);
          l2 = l2.next;
        }
      } else if (l1 == null){
        node = new ListNode(l2.val);
        l2 = l2.next;
      } else {
        node = new ListNode(l1.val);
        l1 = l1.next;
      }
      if (head == null) head = node;
      if (prev!=null) prev.next = node;
      prev = node;
    }
    return head;
  }
}
