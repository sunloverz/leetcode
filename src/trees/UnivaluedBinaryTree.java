package trees;

import java.util.*;

public class UnivaluedBinaryTree {
  private class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
  ArrayList<Integer> list = new ArrayList<>();
  public boolean isUnivalTree(TreeNode root) {
    dfs(root);
    return new HashSet<>(list).size() <= 1;
  }
  private void dfs(TreeNode root) {
    if(root == null) return;
    list.add(root.val);
    dfs(root.left);
    dfs(root.right);
  }
}
