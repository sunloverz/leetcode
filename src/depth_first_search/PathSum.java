package depth_first_search;

public class PathSum {
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

  public boolean hasPathSum(TreeNode root, int sum) {
    return dfs(root, 0, sum);
  }

  public boolean dfs(TreeNode root, int total, int sum) {
    if(root == null) return false;
    if(root.left == null && root.right == null && total + root.val == sum) {
      return true;
    }
    total += root.val;
    return dfs(root.left, total, sum) ||  dfs(root.right, total, sum);
  }
}
