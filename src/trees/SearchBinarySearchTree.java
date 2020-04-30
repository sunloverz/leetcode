package trees;

import java.util.ArrayList;

public class SearchBinarySearchTree {
  private class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }

  public TreeNode searchBST(TreeNode root, int val) {

    ArrayList<Integer> preorderedList = new ArrayList<Integer>();
    if(root == null) return null;
      else if(root.val == val) return root;
      else if(val > root.val) return searchBST(root.right, val);
      else return searchBST(root.left, val);
  }

  public boolean validateBST(TreeNode root) {
    return validateBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE);

  }

  public static boolean validateBST(TreeNode root, int min, int max) {
    if (root == null) {
      return true;
    }
    if (root.val <= min || root.val >= max) {
      return false;
    }
    // left subtree must be < root.val && right subtree must be > root.val
    return validateBST(root.left, min, root.val) && validateBST(root.right, root.val, max);
  }
}
