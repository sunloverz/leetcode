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
    if(root==null) return null;
    else if(root.val>L) return trimBST(root.left, L, R);
    else return trimBST(root.right, L, R);


//    root.left = trimBST(root.left, L, R);
//    root.right = trimBST(root.right, L, R);
//    return root;
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
