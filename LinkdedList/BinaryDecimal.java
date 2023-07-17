package LinkdedList;

public class BinaryDecimal {
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

    public int getDecimalValue(ListNode head) {
        // Brute force we can reverse the linkedlist and then simly do 2 power but this is    not efficient way .
        // we can first find the length of linkedlist then we can calculate 2 power but for this I will need extra traversel for calcualting size.
        // Optimal way - I will think I have only one node and I will simple add value of my present node on 'ans' variable but when I will move one more step then I will multiple my 'ans ' with 2 and also add present node.
       int ans=0;
        ListNode temp=head;
        while(temp!=null)
        {
            ans*=2;
            ans+=temp.val;
            temp=temp.next;
        } 
     return ans;
    }
}   

