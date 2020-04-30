package trees;

import java.util.ArrayList;

public class SumOfRootToLeafBinaryNumbers {
  private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  public int sumRootToLeaf(TreeNode root) {
    return dfs(root, 0, 1);
  }

  public int dfs(TreeNode root, int val, int base) {
    if(root == null) return 0;
    val += root.val == 1? base:0;
    return (root.right == root.left) ? val: dfs(root.right, val, base *2) + dfs(root.left, val, base*2);
  }
}
