/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Insertion {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     //BRUTEFORCE 
     /*while(head2 != null) {
        Node temp = head1;
        while(temp != null) {
            //if both nodes are same
            if(temp == head2) return head2;
            temp = temp.next;
        }
        head2 = head2.next;
    }
    // If intersection is not presenreturn null
        return null; 
    */

    //BETTER approch-TC-O(N+M) S.C:O(N)
         /*  HashSet<Node> st=new HashSet<>();
             while(head1 != null) {
                st.add(head1);
                 head1 = head1.next;
            }
          while(head2 != null) {
            if(st.contains(head2)) return head2;
               head2 = head2.next;
    }
             return null; */

        //OPTIMAL solution:-TCO(2*MAX(length list1,length list2))
        if(headA==null || headB==null)//If any one is null return null becoz no intersection point
               return null;
        ListNode a=headA;//dummy node
        ListNode b=headB;

        while(a!=b)
        {
            a= a==null? headB:a.next;
            b= b==null? headA:b.next;
        }
        return a;
    }
}