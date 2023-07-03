import java.util.HashMap;

public class SubArraySumDivisibleByK {
    
    public int subarraysDivByK(int[] A, int K) {
        /*
        Brute force approch-using 3 nested loop for subarray O(N3)
        //Better approch- prefix sum-O(N2)
        for(int i=0;i<n;i++)
        {       sum=0;   
              for(int j=i;j<n;j++)
            {  
                sum+=nums[j];
               
                if(sum%k==0)
                   count++;
            }
        }
        return count;
        */
        // optimal approch-TC-O(n) sc-O(N)
        HashMap<Integer, Integer> prefixSum = new HashMap<Integer, Integer>();
      prefixSum.put(0,1);
        int runningSum = 0;
        int count = 0 ;
        for(int i=0;i<A.length;i++){
            runningSum += A[i];
            int remainder = runningSum % K;
            if(remainder < 0) remainder +=K;
            if(prefixSum.containsKey(remainder)) {
                count +=prefixSum.get(remainder);      
            }
             prefixSum.put(remainder, prefixSum.getOrDefault(remainder,0)+1);  
        }
        
         return count;
    }            
    }
