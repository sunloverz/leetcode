package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;


public class NaryTreePostorderTraversal {
  List<Integer> list = new ArrayList<>();

  public List<Integer> postorder(Node root) {
    dfs(root);
    return list;
  }

  public void dfs(Node root) {
    if(root == null) return;
    for(Node node:root.children)
      dfs(node);
    list.add(root.val);
  }

  public List<Integer> postorder2(Node root) {
    List<Integer> values = new ArrayList<>();
    if (root == null) return values;

    Stack<Node> stack = new Stack<>();
    stack.add(root);

    while(!stack.isEmpty()) {
      root = stack.pop();
      values.add(root.val);
      for(Node node: root.children)
        stack.add(node);
    }
    Collections.reverse(values);
    return values;
  }
}
