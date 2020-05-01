package trees;

import com.sun.source.tree.Tree;

import java.util.*;

public class TrimBinarySearchTree {
  private class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }

  public TreeNode trimBST(TreeNode root, int L, int R) {
    if (root == null) {
      return null;
    }
    if(L<=root.val && root.val <= R) {
      root.left = trimBST(root.left, L, R);
      root.right = trimBST(root.right, L, R);
    } else if(root.val < L) {
      root = trimBST(root.right, L, R);
    } else if(root.val > R) {
      root = trimBST(root.left, L, R);
    }
    return root;
  }

  public ArrayList<Integer> preorderItr(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    ArrayList<Integer> list = new ArrayList<>();
    while (!queue.isEmpty()){
      TreeNode node = queue.peek();
      list.add(node.val);
      if(node.left!=null) queue.add(node.left);
      if(node.right!=null) queue.add(node.right);
      queue.poll();
    }
    return list;
  }


}
