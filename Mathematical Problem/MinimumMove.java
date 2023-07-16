import java.util.Arrays;

public class MinimumMove {
    
    public int minMoves(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);

        for(int i =0;i<nums.length;i++){
            int diff = (nums[i] - nums[0]);
            sum += diff;
        }
        return sum; 
    }
}

