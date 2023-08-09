package STACK;
import java.util.*;
public class PostfixToInfix {
    Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
         char c=s.charAt(i);
         if(c=='+')
         {
            int a= st.pop();
            int b= st.pop();
           int ans=a+b;
            st.push(ans);
         }
         else if(c=='-')
         {
            int a= st.pop();
            int b= st.pop();
            int ans=b-a;
            st.push(ans);
         }
         else if(c=='*')
         {
            int a= st.pop();
            int b= st.pop();
           int ans=a*b;
            st.push(ans);
         }
         else if(c=='/')
         {
            int a= st.pop();
            int b= st.pop();
            int ans=b/a;
            st.push(ans);
         }
         else{
             int v=c-'0';
             st.push(v);
         }
            
        }
        return st.peek();
}
