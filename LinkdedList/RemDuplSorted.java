public class RemoveDuplicateFro {

 
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public ListNode deleteDuplicates(ListNode head) {
       if(head==null || head.next==null)
        return head;

        ListNode temp=head;
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy;
     
        
        while(temp!=null)
        {   
            if(temp.next!=null && temp.val!=temp.next.val)//values are not equal
            {
                prev=prev.next;
                
            }
            else if(temp.next!=null && temp.val==temp.next.val)
            {
                 while(temp.next!=null && temp.val==temp.next.val)
                 {
                     temp=temp.next;  
                 }
                  prev.next=temp.next;    
                        
              }
             temp=temp.next;
             
        }
        return dummy.next;
    }
}

