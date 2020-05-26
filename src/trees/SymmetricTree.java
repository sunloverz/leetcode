package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
  public boolean isSymmetric(TreeNode root) {
    if(root==null) return true;
    Queue<TreeNode> queue = new LinkedList<>();
    ArrayList<Integer> list = new ArrayList<>();
    queue.add(root);
    while(!queue.isEmpty()){
      int size = queue.size();
      while (size>0){
        TreeNode node = queue.poll();
        if(node.right != null) {
          queue.add(node.right);
          list.add(node.right.data);
        } else list.add(-1);

        if(node.left != null) {
          queue.add(node.left);
          list.add(node.left.data);
        } else list.add(-1);
        size--;
      }
      int right = list.size()-1;
      int left = 0;
      while(left<right) {
        Integer first = list.get(left);
        Integer second = list.get(right);
        if(!first.equals(second)) {
          return false;
        }
        left++;
        right--;
      }

      list.clear();
    }
    return true;
  }
}
