package linked_list;

public class DoublyLinkedList {
  private class DoublyLinkedNode {
    int data;
    DoublyLinkedNode next;
    DoublyLinkedNode prev;
    public DoublyLinkedNode(int data) { this.data = data; }
  }
//  insertAtPos(1<=>2<=>3, 4, 2)
// 1<=>2<=>3
  public DoublyLinkedNode insertAtPos(DoublyLinkedNode head, int data, int pos) {
    int count =0;
    DoublyLinkedNode node = head, prev = null;
    DoublyLinkedNode newNode = new DoublyLinkedNode(data);
    if(pos==1) {
      if(head == null) return newNode;
      newNode.next = head;
      head.prev = newNode;
      return newNode;
    }
    while(node!=null && count<pos) {
      prev = node;
      node = node.next;
      count++;
    }
    if(pos>count) return head;

    prev.next = newNode;
    newNode.prev = prev;
    newNode.next = node;
    node.prev = newNode;
    return head;
  }
}
