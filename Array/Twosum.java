import java.util.HashMap;

public class Twosum {
  
    public int[] twoSum(int[] nums, int target) {

       /* int n=nums.length;
        int[] arr=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]== target)
                {
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
        O(n2)
        */
        int n=nums.length;
        int [] arr=new int[2];
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int value=nums[i];
            int remaining=target-value;
            if(hmap.containsKey(remaining))//check if remaining number is present or not 
            {
                arr[0]=hmap.get(remaining);
                arr[1]=i;
            }
            hmap.put(nums[i],i);//if not present then put value and index into hashmap
        }
        return arr;
    }
    //TC=O(N) becozin worst case loop will run n time and hashmap take O(1) time to check
    // the worst case(which rarely happens), the unordered_map takes O(N) to find an element. In that case, the time complexity will be O(N2). If we use map instead of unordered_map, the time complexity will be O(N* logN) as the map data structure takes logN time to find an element.
} 

