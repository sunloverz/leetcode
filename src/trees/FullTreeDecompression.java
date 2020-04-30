package trees;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FullTreeDecompression {
  private class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }

  public TreeNode decompressTree(String str){
    String[] arr = str.split(",");
    Queue<String> values = new LinkedList<>(Arrays.asList(arr));
    Queue<TreeNode> queue = new LinkedList<>();
    String rootStr = values.poll();
    if(rootStr.equals("*")) return null;
    int rootVal = Integer.parseInt(rootStr);
    TreeNode root = new TreeNode(rootVal);
    queue.add(root);
    while(!queue.isEmpty()) {
      TreeNode node = queue.poll();
      String left = values.poll();
      String right = values.poll();
      if(left!=null && !"*".equals(left)) {
        node.left = new TreeNode(Integer.parseInt(left));
        queue.add(node.left);
      }
      if(right!=null &&!"*".equals(right)) {
        node.right = new TreeNode(Integer.parseInt(right));
        queue.add(node.right);
      }
    }
    return root;
  }
}
