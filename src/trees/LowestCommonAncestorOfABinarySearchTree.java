package trees;

public class LowestCommonAncestorOfABinarySearchTree {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    int parent = root.data;
    int pVal = p.data;
    int qVal = q.data;

    if(parent > pVal && parent > qVal) {
      return lowestCommonAncestor(root.left, p, q);
    } else if(parent < pVal && parent < qVal) {
      return lowestCommonAncestor(root.right, p, q);
    } else {
      return root;
    }
  }
}
