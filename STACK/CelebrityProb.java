package STACK;
import java.util.*;
public class CelebrityProb {

 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n)
    {
    	// code here 
    	int ans=-1;
    	Stack<Integer> s=new Stack<>();
    
      for(int i=0;i<n;i++)
      {
          s.push(i);
      }
       while(s.size()>=2)
       {
           int i=s.pop();
           int j=s.pop();
           
           //i know j that mean i is not cel so remove i and put back j
           if(arr[i][j]==1)
           s.push(j);
           //if i dont know j that means j is not a celebrity
           else
           s.push(i);
       }
       //last remanin ele
       int pot=s.pop();
       for(int i=0;i<n;i++)
       {
           if(i!=pot)
           {
               if(arr[i][pot]==0 || arr[pot][i]==1)
               return -1;
           }
       }
       return pot;
    }
}

