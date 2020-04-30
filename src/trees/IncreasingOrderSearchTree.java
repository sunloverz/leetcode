package trees;

import java.util.ArrayList;

public class IncreasingOrderSearchTree {
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

  public TreeNode increasingBST(TreeNode root) {
    if(root == null) return null;
    ArrayList<TreeNode> list = new ArrayList<>();
    dfs(root, list);
    TreeNode first = list.get(0);
    TreeNode tmp = null;
    for(int i=0;i<list.size()-1;i++){
      tmp = list.get(i);
      tmp.right = list.get(i+1);
      tmp.left = null;
    }
    return first;
  }

  private void dfs(TreeNode root, ArrayList<TreeNode> list) {
    if(root == null) return;
    dfs(root.left, list);
    list.add(root);
    dfs(root.right, list);
  }

  TreeNode node = new TreeNode(0);
  public TreeNode increasingBST2(TreeNode root) {
    inorder(root);
    return node;
  }

  private void inorder(TreeNode root) {
    if(root == null) return;
    inorder(root.left);
    node = root;
    node.left = null;
    node.right = root;
    inorder(root.right);
  }
}
