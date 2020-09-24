package linked_list;

public class RemoveDuplicatesfromSortedList {
  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode deleteDuplicates(ListNode head) {
    if(head == null) return null;
    ListNode node = head.next;
    ListNode prev = new ListNode(head.val);
    ListNode newHead = prev;
    while(node != null) {
      if(prev.val != node.val) {
        ListNode tmp = new ListNode(node.val);
        prev.next = tmp;
        prev = tmp;
      }
      node = node.next;
    }

    return newHead;
  }
}
