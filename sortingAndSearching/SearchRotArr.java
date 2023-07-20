package sortingAndSearching;

public class SearchRotArr {
    public int search(int[] nums, int key) {
        int n=nums.length;
       int low=0;
       int high=n-1;
       while(low<=high){
         int  mid=(low+high)/2;
           if(nums[mid]==key)
           return mid;
           if(nums[low]<=nums[mid])//left part sorted
           {
               if(key>=nums[low] && key<nums[mid])
               {
                   high=mid-1;
               }
               else 
               low=mid+1;
           }
           else{//right part sorted
               if(key>nums[mid] && key<=nums[high])
                low=mid+1;
               else
                high=mid-1;
           }
       }
       return -1;
    }
} 
