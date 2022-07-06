/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      if (lists == null || lists.length == 0) {
            return null;
      }
      PriorityQueue<ListNode> p = new PriorityQueue<>((o1,o2)->o1.val-o2.val);
      ListNode dummy = new ListNode(-1);
      ListNode prev = dummy;
      for(ListNode list : lists){
          if(list!=null){
              p.add(list);
          }
      }
      while(p.size()>0){
          ListNode curr = p.poll();
          prev.next = curr;
          prev = curr;
          if(curr.next!=null){
              p.add(curr.next);
          }
      }
     return dummy.next;
  
  }
}