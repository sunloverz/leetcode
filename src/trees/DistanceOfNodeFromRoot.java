package trees;

public class DistanceOfNodeFromRoot {
  public int pathLengthFromRoot(TreeNode root, int n1) {
    if(root == null) return 0;
    if(root.data == n1) return 1;

    int ans = pathLengthFromRoot(root.left, n1);
    if(ans > 0) {
      return 1 + ans;
    }

    ans = pathLengthFromRoot(root.right, n1);
    if(ans > 0) {
      return 1 + ans;
    }

    // Num not found in tree.
    return 0;
  }

  public TreeNode search(TreeNode root, int data)
  {
    // Base Cases: root is null or key is present at root
    if (root==null || root.data==data)
      return root;

    // val is greater than root's key
    if (root.data > data)
      return search(root.left, data);

    // val is less than root's key
    return search(root.right, data);
  }


}
