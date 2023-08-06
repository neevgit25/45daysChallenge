package STACK;

import java.util.LinkedList;
import java.util.Queue;

public class MyStackusingQueue {
    
    Queue<Integer> q1;
    public MyStackusingQueue() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
        for(int i=0; i<q1.size()-1; i++){
            q1.add(q1.remove());
        }
    }
    
    public int pop() {
        int removed = q1.remove();
        return removed;
    }
    
    public int top() {
        int peeked = q1.peek();
        return peeked;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

