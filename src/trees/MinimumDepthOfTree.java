package trees;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfTree {
  public int minTreeDepth(TreeNode root) {
    if(root ==null) return 0;
    Queue<TreeNode> queue = new LinkedList<>();
    int depth = 0;
    queue.add(root);
    while(!queue.isEmpty()){
      depth++;
      int size = queue.size();
      while(size>0) {
        TreeNode node = queue.poll();
        if(node==null) break;
        if(isLast(node)) return depth;
        if(node.left!=null) queue.add(node.left);
        if(node.right!=null) queue.add(node.right);
        size--;
      }
    }
    return depth;
  }

  public boolean isLast(TreeNode node) {
    return node.left == null && node.right == null;
  }
}
