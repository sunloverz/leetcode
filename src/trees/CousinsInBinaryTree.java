package trees;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class CousinsInBinaryTree {
  public boolean isCousins(TreeNode root, int x, int y) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
      int size = queue.size();
      boolean isXexist = false;
      boolean isYexist = false;
      while(size >0) {
        TreeNode node = queue.poll();
        if(node.data == x) isXexist = true;
        if(node.data == y) isYexist = true;
        if(node.left!=null && node.right!=null) {
          if(node.left.data == x && node.right.data == y) return false;
          if(node.left.data == y && node.right.data == x) return false;
        }
        if(node.left!=null) queue.add(node.left);
        if(node.right!=null) queue.add(node.right);
        size--;
      }
      if(isXexist && isYexist) return true;
    }
    return false;
  }
}
