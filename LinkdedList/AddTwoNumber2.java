import java.util.Stack;

public class AddTwoNumber2 {

 
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1=listToStack(l1);
        Stack<Integer> st2=listToStack(l2);
        ListNode head=null;
        int carry=0;
        while(!(st1.isEmpty()) || !st2.isEmpty() || carry!=0)
        {
           int sum=carry;
            if(!st1.isEmpty()) 
            sum+=st1.pop();
            if(!st2.isEmpty())
            sum+=st2.pop();

            ListNode l3=new ListNode(sum%10);// last digit eg 17->7
            l3.next=head;
            head=l3;

            carry=sum/10;// 17->1 carry
             
        }
        return head;
    }
    public Stack<Integer> listToStack(ListNode h)
     {
         Stack<Integer>s1=new Stack();

         while(h!=null)
         {
          int val=h.val;
          s1.push(val);
           h=h.next;
         }
         return s1;
     }
}

