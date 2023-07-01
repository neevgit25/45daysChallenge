/*
Brute force approch
class Solution {
    public void moveZeroes(int[] nums) {
    ArrayList<Integer> arr=new ArrayList<>();
   
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            arr.add(nums[i]);
          
        }
        int i=0;
       while(i<arr.size())
       {
           nums[i]=arr.get(i);
           i++;
       }
       while(i<nums.length)
       {
           nums[i]=0;
           i++;
       }
    }
}
*/
class Solution {
    public void moveZeroes(int[] nums) {
       int n=nums.length;
       if(n==0||n==1)
       return;
        int right=0;
        int left=0;
        int temp;
      while (right<nums.length)
      {
           if(nums[right]==0)
           {
             right++;
           }
           else
           {
                 temp=nums[left];
                 nums[left]=nums[right];
                 nums[right]=temp;
                 right++;
                 left++;
           }
       }
        
    }
}