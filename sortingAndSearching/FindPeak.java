public class FindPeak {
 
        public int findPeakElement(int[] arr) {
        
            //int c=0;
           // if(nums.length==1)
           // return c;
           // if(nums[0]>Integer.MIN_VALUE && nums[0]>nums[1])
             //           c=0;
            //for(int i=1;i<nums.length-1;i++)
            // {  
              //   if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
                //      c=i;
               
             // }
       // if(nums[nums.length-1]>Integer.MIN_VALUE && nums[nums.length-1]>nums[nums.length-2])
              //    c=nums.length-1;
           // return c;
           //Optimise way -Binary search TC-O(log n)
           int n=arr.length;
            if (n == 1)
             return 0;
            if (arr[0] > arr[1]) 
              return 0;
            if (arr[n - 1] > arr[n - 2]) 
             return n - 1;
    
            int low = 1, high = n - 2;
            while (low <= high) {
                int mid = (low + high) / 2;
    
                // If arr[mid] is the peak:
                if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
                    return mid;
    
                // If we are in the left:
                if (arr[mid] > arr[mid - 1])
                 low = mid + 1;
    
                // If we are in the right:
                else high = mid - 1;
            }
           
            return -1;
            
        }
    }

