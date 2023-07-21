public class palindrom {
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

    public boolean isPalindrome(ListNode head) {
         if(head==null||head.next==null) return true;
        //find middle element TC-O(n/2)
            ListNode slow = head;
            ListNode fast = head;
        
    while(fast.next!=null&&fast.next.next!=null) {
        slow = slow.next;
        fast = fast.next.next;
    }
        // reverse right half of linked list TC-O(n/2) 
    slow.next = reverse(slow.next);
    slow = slow.next;
    ListNode dummy = head;
        // comapre to check palindrome or not
    while(slow!=null) {
        if(dummy.val != slow.val) return false;
        dummy = dummy.next;
        slow = slow.next;
    }
    return true;
    }
    public static ListNode reverse(ListNode ptr)
    {
        ListNode pre=null;
        ListNode nxt=null;
        while(ptr!=null)
        {
        nxt = ptr.next;
        ptr.next = pre;
        pre=ptr;
        ptr=nxt;
        }
        return pre;
    }
}


