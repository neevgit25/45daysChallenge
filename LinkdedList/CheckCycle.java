

public class CheckCycle {
    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

    public boolean hasCycle(ListNode head) {
     /*BRUTE FORCE- we can take a hashtable and enter the node and check if node is alreasy present or not if node is already present we can return false and if not present and we reach null then we can return true so, TC-O(Ṇ) BUT S.C IS ALSO O(N)*/   

     // OPTIMISE -2 POINTER APPROCH (SLOW AND FAST)
    
     if(head==null || head.next==null)
     return false;
     
     ListNode slow= head;
     ListNode fast=head;
      while(fast.next!=null && fast.next.next!=null)
      {
          fast=fast.next.next;//fat move two steps 
          slow=slow.next;// slow move one step

          if(fast==slow)// if they point to same node at any moment that means cycle found
          return true;
      }
  return false;
    }
}

