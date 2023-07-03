public class removeduplicate {
   
    public int removeDuplicates(int[] nums) {
        int n=nums.length,index=1,i;
        for(i=1;i<n;i++){
         if(nums[i-1] != nums[i])
         {
             nums[index]=nums[i];
             index++;
         }
        }
          return index;
    }
}
