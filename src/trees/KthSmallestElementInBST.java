package trees;

import java.util.*;

public class KthSmallestElementInBST {
  List<Integer> list = new ArrayList<>();
  public int kthSmallest(TreeNode root, int k) {
    dfs(root);
    return list.get(k-1);
  }

  private void dfs(TreeNode root) {
    if(root ==null) return;
    dfs(root.left);
    list.add(root.data);
    dfs(root.right);
  }

}
