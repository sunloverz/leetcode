package trees;

public class BalancedBinaryTree {
  boolean ans = true;

  public boolean isBalanced(TreeNode root) {
    max(root);
    return ans;
  }

  public int max(TreeNode root) {
    if (root == null) return 0;
    int right = max(root.right);
    int left = max(root.left);
    if(Math.abs(right - left) > 1) {
      ans = false;
    }
    return Math.max(right, left) + 1;
  }
}
