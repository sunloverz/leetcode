package trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfNaryTree {
  public int maxDepth(Node root) {
    if(root == null) return 0;
    int depth = 0;
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()) {
      depth++;
      int size = queue.size();
      while(size>0) {
        Node node = queue.poll();
        queue.addAll(node.children);
        size--;
      }
    }
    return depth;
  }
}
