package trees;

import java.util.ArrayList;

public class TwoSumIVInputIsBST {
  public boolean findTarget(TreeNode root, int k) {
    ArrayList<Integer> list = new ArrayList<>();
    if(root == null) return false;
    helper(root, list);
    if(list.size()==1) return false;
    for(int i=0;i<list.size();i++) {
      int num = k-list.get(i);
      if(list.contains(num) && list.indexOf(num)!=i)
        return true;
    }
    return false;
  }

  private void helper(TreeNode root, ArrayList<Integer> list) {
    if(root ==null) return;
    list.add(root.data);
    helper(root.left, list);
    helper(root.right, list);
  }
}
