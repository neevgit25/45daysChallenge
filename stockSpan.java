package STACK;

import java.util.Stack;

    class stockSpan {
 static class Pair{
            int price;
            int index;
        }
        Stack<Pair> st;
        int time=0;// for indexing
    public stockSpan() {
            st=new Stack<>();
            Pair base=new Pair();
            base.price =1000000;//10^6 becoz constrain is 10^5
            base.index=-1;
            st.push(base);
        }
    
    
    public int next(int price) {
        Pair p=new Pair();
        p.price=price;
        p.index=time;
        time++;

        while(st.peek().price<=p.price)
        {
            st.pop();
        }
        int ans=p.index-st.peek().index;
        
        st.push(p);

        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

