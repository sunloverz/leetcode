package trees;

public class DiameterOfBinaryTree {
  int max = 0;

  public int diameterOfBinaryTree(TreeNode root) {
    maxDepth(root);
    return max;
  }

  int maxDepth(TreeNode node) {
    if (node == null) return 0;
    int lDepth = maxDepth(node.left);
    int rDepth = maxDepth(node.right);
    max = Math.max(max, lDepth + rDepth);
    return Math.max(lDepth, rDepth) + 1;
  }
}
