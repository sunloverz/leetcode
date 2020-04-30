package linked_list;

public class FindTheMiddleOfLinkedList {
  class ListNode {
    int data;
    ListNode next;
    ListNode(int data) { this.data = data; }
  }

  public ListNode findMiddleNode(ListNode head) {
    ListNode slow = head, fast = head;
    while(slow!=null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public ListNode deleteAtHead(ListNode head) {
    if(head == null) return null;
    ListNode node = head.next;
    head = null;
    return node;
  }

  public ListNode deleteAtTail(ListNode head) {
    ListNode n = head;
    while(n.next!=null) {
      n = n.next;
    }
    System.out.println(n.data);
    n = null;
    return head;
  }
}
