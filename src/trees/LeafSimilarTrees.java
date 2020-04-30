package trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;

public class LeafSimilarTrees {
  private class TreeNode {
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

  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    ArrayList<Integer> firstList = new ArrayList<>();
    ArrayList<Integer> secondList = new ArrayList<>();
    dfs(root1, firstList);
    dfs(root2, secondList);
    return firstList.equals(secondList);
  }

  public void dfs(TreeNode root, ArrayList<Integer> list) {
    if(root==null) return;
    if(root.left==null && root.right==null)
      list.add(root.val);
    dfs(root.left, list);
    dfs(root.right, list);
  }
}
