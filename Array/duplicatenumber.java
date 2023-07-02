public class duplicatenumber {
    /*
     Brute force apporch
     class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int num=0;
        Arrays.sort(nums);
        
       for(int i=0;i<n;i++)
       {
           
           if(nums[i]==nums[i+1]){
                num=nums[i];
                   break;
           }
          
       
       }
       
      
       return num;
    }
}

TC-O(N LOG N)-> SORTING
SC-O(1)

BETTER WAY -we can use frequeny array but then sc-O(N)
     */

    public int findDuplicate(int[] nums) {
  // best way TC=O(N) SC=O(1)
    //LINKED LIST CYCLE METHOD
   int slow=nums[0];
    int fast=nums[0];
    do{
        slow=nums[slow];//increment the pointer by 1
        fast=nums[nums[fast]];//increment the pointer by 2
    }
    while(slow!=fast);//when slow and fast pointer meets end the loop

    fast=nums[0];//again place fast pointer at starting;
    while(slow!=fast)
    {
        slow=nums[slow];
        fast=nums[fast];//increase by one
    }
    //again they will meet so that is duplicate value;
    return slow; //or fast
    }

}

