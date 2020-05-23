package trees;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
  List<String> list = new LinkedList<>();
  public List<String> binaryTreePaths(TreeNode root) {
    if(root == null) return list;
    helper(root, "");
    return list;
  }

  private void helper(TreeNode root, String str) {
    if(root.left == null && root.right == null){
      str += root.data;
      list.add(str);
    }
    str += root.data + "->";
    if(root.left!=null) helper(root.left, str);
    if(root.right!=null) helper(root.right, str);
  }
}
