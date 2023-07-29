public class Rev2 {
    
 
  public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null)// 0 or 1 eleent 
        return head;
       ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode curr=dummy;
        ListNode prev=null;
        //Traverse till left 
          for(int i=0;i<left;i++)
          {
              prev=curr;
              curr=curr.next;
          }
          //normally reverse the linklist from n to m
          ListNode it=curr;
          ListNode previt=prev;
          for(int i=left;i<=right;i++)
          {   ListNode forw=it.next;
              it.next=previt;
              previt=it;
              it=forw;
          }

          //arrangement 
          prev.next=previt;
          curr.next=it;
   return dummy.next;
}
}

