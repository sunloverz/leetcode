package trees;

public class BinaryTreeTilt {
  int tilt = 0;
  public int findTilt(TreeNode root) {
    helper(root);
    return tilt;
  }

  public int helper(TreeNode root) {
    if(root == null) return 0;
    int left = helper(root.left);
    int right = helper(root.right);
    tilt += Math.abs(right - left);
    return left + right + root.data;
  }
}
