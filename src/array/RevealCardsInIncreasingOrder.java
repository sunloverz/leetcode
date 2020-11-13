package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {
  public int[] deckRevealedIncreasing(int[] deck) {
    int[] res = new int[deck.length];
    int[] ans = new int[deck.length];
    Arrays.sort(deck);
    Queue<Integer> queue = new LinkedList<>();
    for(int i=0;i<deck.length;i++)
      queue.add(i);
    for(int i=0;i<deck.length;i++){
      res[i] = queue.poll();
      queue.add(queue.poll());
    }
    for(int i=0;i<deck.length;i++)
      ans[res[i]] = deck[i];

    return ans;
  }
}
