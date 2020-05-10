package trees;

import java.util.Stack;

public class ConvertBSTtoGreaterTree {
  int sum =0;
  public TreeNode convertBST(TreeNode root) {
    if(root == null) return null;
    convertBST(root.right);
    sum += root.data;
    root.data = sum;
    convertBST(root.left);
    return root;
  }

  public TreeNode convertBST2(TreeNode root) {
    if(root == null) return null;
    TreeNode node = root;
    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);
    int sum = 0;
    while(!stack.isEmpty()){
      while(node != null) {
        node = node.right;
        stack.add(node);
      }
      node = stack.pop();
      sum += node.data;
      node.data  = sum;
      node = node.left;
    }
    return root;
  }
}
