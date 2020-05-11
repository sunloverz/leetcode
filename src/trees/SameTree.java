package trees;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p==null && q==null) return true;
    Queue<TreeNode> queue = new LinkedList<>();
    Queue<TreeNode> queue2 = new LinkedList<>();
    queue.add(p);
    queue2.add(q);
    while(!queue.isEmpty() || !queue2.isEmpty()){
      TreeNode first = queue.poll();
      TreeNode second = queue2.poll();
      if(first == null || second == null) return false;
      if(first.data != second.data) return false;
      if(first.left !=null && second.left !=null) {
        queue.add(first.left);
        queue2.add(second.left);
      } else if(first.left != second.left) return false;
      if(first.right!=null && second.right!=null) {
        queue.add(first.right);
        queue2.add(second.right);
      } else if(first.right != second.right) return false;
    }
    return true;
  }
}
