package trees;

import com.sun.source.tree.Tree;

public class InvertBinaryTree {
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
  public TreeNode invertTree(TreeNode root) {
    if(root == null) return null;
    TreeNode node = root.left;
    root.left = root.right;
    root.right = node;
    invertTree(root.left);
    invertTree(root.right);
    return root;
  }
}