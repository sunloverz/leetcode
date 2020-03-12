package linked_list;

public class ReverseLinkedList {
  private static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }

  private static ListNode reverseList(ListNode head) {
    ListNode next, prev, current;
    current = head;
    prev = null;

    while(current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    head = prev;
    return head;
  }

  public static void main(String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    ListNode head = reverseList(node1);
    System.out.println(head.val);
  }

}


