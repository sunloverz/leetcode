package trees;

import java.util.ArrayList;

public class MinimumAbsoluteDifferenceInBST {
  public int getMinimumDifference(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<>();
    helper(root, list);
    int min = Integer.MAX_VALUE;
    for(int i=0;i<list.size()-1;i++)
      min = Math.min(min, list.get(i+1)-list.get(i));
    return min;
  }

  private void helper(TreeNode root, ArrayList<Integer> list) {
    if(root == null) return;
    helper(root.left, list);
    list.add(root.data);
    helper(root.right, list);
  }
}
