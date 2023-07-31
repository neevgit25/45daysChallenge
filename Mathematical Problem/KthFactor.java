import java.util.ArrayList;

public class KthFactor {
    
    public int kthFactor(int n, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(-1);
        int ans=-1;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
             arr.add(i);
        }
       if(arr.size()>k)
        return arr.get(k);
         
    
  return -1;
    }
}

