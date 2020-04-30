package trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.concurrent.RecursiveTask;

public class BinaryTreeSerialization {
  ArrayList<String> list = new ArrayList<>();
  public String serializeTree(TreeNode root){
    if(root == null) return "";
    dfs(root);
    return String.join(",", list);
  }

  public TreeNode restoreTree(String str){
    if(str == null || str.length()==0) return null;
    String[] arr = str.split(",");
    TreeNode root = new TreeNode(Integer.parseInt(arr[0]), null, null);
    for(int i=1;i<arr.length;i++)
       root = insert(root, Integer.parseInt(arr[i]));
    return root;
  }

  public TreeNode insert(TreeNode root,int val) {
    if(root == null) return new TreeNode(val, null, null);
    if(val < root.data) root.left = insert(root.left, val);
    else root.right = insert(root.right, val);
    return root;
  }

  public void dfs(TreeNode root) {
    if(root == null) return;
    list.add(String.valueOf(root.data));
    dfs(root.left);
    dfs(root.right);
  }
}
