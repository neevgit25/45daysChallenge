public class PartitionList {
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

    //TC=O(N)  SC=O(1) AS WE HAVE USED TWO POINTER APPROCH
    public ListNode partition(ListNode head, int x) {
        // first make a two list one is smaller list which contain node whose value is less   than x AND second list is greater list which contain value greater or eqaul to x
             ListNode smaller=new ListNode(-1);//dummy node
             ListNode greater=new ListNode(-1);//  "    "
             ListNode sIt=smaller;
             ListNode gIt=greater;
             ListNode it=head;
            while(it!=null)
            {
                //for nodes whose value is less than x
                if(it.val<x){
                 sIt.next=it;
                 it=it.next;
                 sIt=sIt.next;
                }
                else{
                    //for nodes whoes val is equal to more than x
                    gIt.next=it;
                  it=it.next;
                 gIt=gIt.next;
                }
            }
            sIt.next=greater.next;// for no cycles
              gIt.next=null;      // "    "    "

        return smaller.next;
    }
}

