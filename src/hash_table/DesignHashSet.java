package hash_table;

import java.util.ArrayList;

class MyHashSet {
  private ArrayList<Integer> list;

  /** Initialize your data structure here. */
  public MyHashSet() {
    list = new ArrayList<>();
  }

  public void add(int key) {
    if (!contains(key)) {
      list.add(key);
    }
  }

  public void remove(int key) {
    if (contains(key)) {
      list.remove(Integer.valueOf(key));
    }
  }

  /** Returns true if this set contains the specified element */
  public boolean contains(int key) {
    return list.contains(key);
  }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
