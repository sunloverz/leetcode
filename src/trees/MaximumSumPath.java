package trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumSumPath {
  public static int maxSumPath(TreeNode root) {
    if(root == null) return 0;
    int left = maxSum(root.left);
    int right = maxSum(root.right);
    return left + right + root.data;
  }

  public static int maxSum(TreeNode root){
    if(root == null) return 0;
    int leftSum = maxSum(root.left);
    int rightSum = maxSum(root.right);
    return root.data + Math.max(leftSum, rightSum);
  }

  public int minTreeDepth(TreeNode root) {
    if(root == null) return 0;
    int depth = 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()) {
      TreeNode node = queue.poll();

    }
    return depth;
  }
  public boolean isBlank(TreeNode root) {
    return root.left == null && root.right == null;
  }
}
