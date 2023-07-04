import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
      public List<Integer> findDuplicates(int[] nums) {
      /*BRUTE FORCE APPROCH-O(NLOGN) SC-O(1)
        Arrays.sort(nums);
        ArrayList<Integer>ll=new ArrayList<>();
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
               ll.add(nums[i]);
        }
        return ll;
        */
        // BETTER APPROCH -USING HASHMAP TC-O(N) SC-O(N)
        //OPTIMAL APPROCH -WE WILL TRAVERSE THE ARRAY AND FOR EACH ELEMENT WE WILL CHECK FOR THAT INDEX AND 
         // MAKE VALUE AT THE INDEX NEGATIVE IF THE NUMBER HAS APPEARED TWICE I.E ALREADY MARKED NEGATIVE 
        // THEN ADD IN ARRALIST
        
         ArrayList<Integer>ll=new ArrayList<>();
         for(int i=0;i<nums.length;i++)
         {
             int n=Math.abs(nums[i]);
             if(nums[n-1]>0)
              nums[n-1]*=-1;
              else
              ll.add(n);
         }

           return ll;
           //TCO(N) SC-O(1)
    }
}

