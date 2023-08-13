import java.util.*;
public class MaxOfMin {
    
        //Function to find maximum of minimums of every window size.
        static int[] maxOfMin(int[] arr, int n) 
        {
            // Your code here
            Stack<Integer> s=new Stack<>();
            int left[]=new int[n+1];
            int right[]= new int[n+ 1];
            
            for(int i=0;i<n;i++)
            {
                left[i]=-1;
                right[i]=n;
            }
            
            //next greater smallest left
            for(int i=0;i<n;i++)
            {
                while(!s.isEmpty() && arr[s.peek()]>=arr[i])
                  s.pop();
                  
                  if(!s.isEmpty())
                   left[i]=s.peek();
                   
                   s.push(i);
        
            }
            while(!s.isEmpty())
             s.pop();
            //next greater smallest right
            for(int i=n-1;i>=0;i--)
            {
                while(!s.isEmpty() && arr[s.peek()]>=arr[i])
                  s.pop();
                  
                  if(!s.isEmpty())
                   right[i]=s.peek();
                   
                   s.push(i);
        
            }
            int ans[]=new int[n+1];
            
            for(int i=0;i<=n;i++)
            ans[i]=0;
            
            for(int i=0;i<n;i++)
            {
                int len=right[i]-left[i]-1;
                
                ans[len]=Math.max(ans[len],arr[i]);
            }
            
            for (int i = n - 1; i >= 1; i--)
                ans[i] = Math.max(ans[i], ans[i + 1]);
     
           int res[]=new int[n];
            for (int i = 1; i <=n; i++)
             res[i-1]=ans[i];
        
        return res;
        }
    }

