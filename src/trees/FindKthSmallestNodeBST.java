package trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class FindKthSmallestNodeBST {
  ArrayList<TreeNode> list = new ArrayList<>();
  public TreeNode findKthSmallest(TreeNode root, int k) {
    dfs(root);
    int length = list.size();
    if(k>length) return null;
    return list.get(k-1);
  }

  public void dfs(TreeNode root){
    if(root == null) return;
    dfs(root.left);
    list.add(root);
    dfs(root.right);
  }

  int counter = 0;
  TreeNode val;
  public TreeNode findKthSmallest2(TreeNode root, int k) {
    inorder(root, k);
    return val;
  }

  public void inorder(TreeNode root, int k) {
    if(root == null) return;
    inorder(root.left, k);
    if(++counter == k) {
      val = root;
      return;
    }
    inorder(root.right, k);
  }
}
