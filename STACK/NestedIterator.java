package STACK;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;


    /**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
   List<Integer> ans=null;
 int curr=0;
       public NestedIterator(List<NestedInteger> nestedList) {
        ans=new ArrayList<>();
        for(NestedInteger x :nestedList)
        {
            helper(x);
        }
    }

    @Override
    public Integer next() {
        return ans.get(curr++);
    }

    @Override
    public boolean hasNext() {
      return curr<ans.size();//return true if it has next element   
    }
    private void helper(NestedInteger val)
    {
        if(val.isInteger())
        {
            ans.add(val.getInteger());
        }
        else
        {
          for(NestedInteger x :val.getList())
        {
              helper(x);
        }  
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */

