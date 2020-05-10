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

  int val = Integer.MAX_VALUE;
  public int getMinimumDifference2(TreeNode root) {
    if(root == null) return 0;
    getMinimumDifference(root.left);
    if (val == Integer.MAX_VALUE) {
      val = root.data;
    } else {
      val -= root.data;
    }
    getMinimumDifference(root.right);
    return val;
  }

}
