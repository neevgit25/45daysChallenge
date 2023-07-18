package LinkdedList;
import java.util.*;
public class RemoveDuplicates {
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

    public ListNode deleteDuplicates(ListNode head) {
       ListNode temp=head;
        
        if(temp==null)// If the list is empty then return null
          return null;
       while(temp!=null)
       {
           if((temp.next!=null) && temp.val==temp.next.val)// if current node's next is not 
           {                           //null and current node value is equal to next node val.
               temp.next=temp.next.next;
           }
           else
           temp=temp.next;
       }
       return head;
    }
}

