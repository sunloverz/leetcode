package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class NaryTreePreorderTraversal {
  List<Integer> list = new ArrayList<>();
  public List<Integer> preorder(Node root) {
    dfs(root);
    return list;
  }

  public void dfs(Node root) {
    if(root == null) return;
    list.add(root.val);
    for(Node node:root.children)
      dfs(node);
  }

  public List<Integer> preorder2(Node root) {
    List<Integer> values = new ArrayList<>();
    if(root == null) return values;

    Stack<Node> stack = new Stack<>();
    stack.add(root);

    while(!stack.isEmpty()){
      Node node = stack.pop();
      list.add(node.val);
      for(int i=node.children.size()-1;i>=0;i--)
        stack.add(node.children.get(i));
    }
    return values;
  }
}
