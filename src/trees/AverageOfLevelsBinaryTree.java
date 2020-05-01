package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsBinaryTree {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> list = new ArrayList<>();
    if(root == null) return list;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()) {
      int size = queue.size();
      double sum = 0;
      int count = size;
      while(size>0) {
        TreeNode node = queue.poll();
        sum+= node.val;
        if(node.left!=null) queue.add(node.left);
        if(node.right!=null) queue.add(node.right);
        size--;
      }
      list.add(sum/count);
    }
    return list;
  }
}
