package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    if(root == null) return list;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
      int size = queue.size();
      List<Integer> values = new ArrayList<>();
      while(size>0){
        TreeNode node = queue.poll();
        values.add(0, node.data);
        if(node.right!=null) queue.add(node.right);
        if(node.left!=null) queue.add(node.left);
        size--;
      }
      list.add(0, values);
    }
    return list;
  }
}
