package trie;

import java.util.HashMap;

class TrieNode {
  Character c;
  Boolean isLeaf = false;
  HashMap<Character, TrieNode> children = new HashMap<>();
  public TrieNode() {}
  public TrieNode(Character c) {
    this.c = c;
  }
  public HashMap<Character, TrieNode> getChildren() {
    return children;
  }
}

class Trie {
  private TrieNode root;

  // Implement these methods :
  public Trie() {
    root = new TrieNode();
  }

  public void insertWord(String word) {
    TrieNode current = root;
    for(int i=0;i<word.length();i++)
      current = current.getChildren().computeIfAbsent(word.charAt(i), c -> new TrieNode());
    current.isLeaf = true;
  }

  public Boolean searchWord(String word) {
    if(word.isBlank()) return false;
    TrieNode current = root;
    for(int i=0;i<word.length();i++){
      char ch = word.charAt(i);
      TrieNode node = current.getChildren().get(ch);
      if(node == null) return false;
      current = node;
    }
    return current.isLeaf;
  }

  public Boolean searchPrefix(String word) {
    TrieNode current = root;
    for(int i=0;i<word.length();i++){
      char ch = word.charAt(i);
      TrieNode node = current.getChildren().get(ch);
      if(node == null) return false;
      current = node;
    }
    return true;
  }


}
