package linked_list;



public class DeleteNodeInLinkedList {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }

  public void deleteNode(ListNode node) {
    ListNode next;
    while(node != null) {
      next = node.next;
      if(next == null) {
        node = null;
        break;
      }
      node.val = next.val;
      node = next;
    }
  }
}

