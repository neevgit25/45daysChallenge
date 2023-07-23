package STACK;

import java.util.Stack;

public class MyQueue {
   
 Stack<Integer> inp,out;
    public MyQueue() {
     inp=new Stack();
     out=new Stack();
    }
    
    public void push(int x) {
        inp.push(x);
    }
    
    public int pop() {
       int x=peek();
        out.pop();
           return x;
    }
    
    public int peek() {
        if(out.empty()==true)
        {
            while(inp.empty()==false)
            {
                out.push(inp.pop());
            }
        }
        return out.peek(); 
    }
    
    public boolean empty() {
        return inp.empty() && out.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

