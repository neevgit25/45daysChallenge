import java.util.Arrays;

public class missingNumber {
    
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int mis=nums.length;
        for(int i=0;i<nums.length;i++)
        {
         if(c==nums[i])
          c++;
          else
           mis=c;
        }
        return mis;
    }
}

